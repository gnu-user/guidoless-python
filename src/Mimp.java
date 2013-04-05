/**
 * Minimp -- An implementation of an imperative subset of Python
 *
 *
 * Copyright (C) 2013, Joseph Heron, Jonathan Gillett, and Daniel Smullen
 * All rights reserved.
 *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 * Mimp -- A compiler for Minimp, an imperative subset of Python, generates
 * assembly code for the MIPS architecture.
 */
public class Mimp
{
    /* Exit return codes */
    private static final int VALID_SOURCE_FILE   =  0;
    private static final int INVALID_SOURCE_FILE = -1;
    private static final int FILE_NOT_FOUND      = -2;
    private static final int INVALID_ARGUMENTS   = -3;
    private static final int WRITE_FAILURE       = -4;
    
    /* The input file and resultant assembly output file */
    private static String inputSourceFile;
    private static String outputASMFile;
    
    public static void main(String args[])
    {
        Minimp parser = null;

        /* Attempt to read the Minimp source file provided */
        if (args.length == 2)
        {
            System.out.println("Mimp -- A Minimp Compiler:  Reading from source file " + args[0] + " . . .");
            inputSourceFile = args[0];
            outputASMFile = args[1];
            
            try
            {                
                parser = new Minimp(new java.io.FileInputStream(inputSourceFile));
            }
            catch (java.io.FileNotFoundException e)
            {
                System.out.println("Mimp -- A Minimp Compiler:  File " + args[0] + " not found.");
                System.exit(FILE_NOT_FOUND);
            }
        }
        /* Minimp source file or output file not provided, print program usage */
        else
        {
            System.out.println("Mimp -- A Minimp Compiler:  Invalid arguments provided!");
            System.out.println("USAGE:  java Mimp source_file output_file");
            System.out.println("EXAMPLE:  java Mimp fibonacci.mimp fibonacci.asm");
            System.exit(INVALID_ARGUMENTS);
        }

        /* Attempt to parse the Minimp source file and generate the assembly output from the AST */
        try
        {
            SimpleNode tree = parser.Program();
            
            parser.print_AST(tree,"   ");
            System.out.println("\n" + parser.print_AST(tree) + "\n");
           
            /* Perform semantic analysis of the AST and return the generated ASM code */
            System.out.println("Mimp -- A Minimp Compiler:  Generating assembly output file " + outputASMFile + " . . .");
            ArrayList<String> asmBuffer = (ArrayList<String>) tree.interpret();
            
            /* Attempt to write the generate ASM code to a file */
            try 
            {
                BufferedWriter writer;
                File file = new File(outputASMFile);
     
                /* Create the file if it does not exist */
                if (!file.exists())
                {
                    file.createNewFile();
                }
        
                writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
                
                /* Write the generated ASM to the file */
                for (String line : asmBuffer)
                {
                    writer.write(line + "\n");
                }
                
                writer.close();
            } 
            catch (IOException e)
            {
                System.out.println("Mimp -- A Minimp Compiler:  Encountered errors writing assembly output file.");
                e.printStackTrace();
                System.exit(WRITE_FAILURE);
            }
            
            System.out.println("Assembly output file " + outputASMFile + " generated successfully!");
            System.exit(VALID_SOURCE_FILE);
        } 
        catch (ParseException pe)
        {
            System.out.println("Mimp -- A Minimp Compiler:  Encountered errors during parse.");
            pe.printStackTrace();
            System.exit(INVALID_SOURCE_FILE);
        }
        catch (Exception e)
        {
            System.out.println("Mimp -- A Minimp Compiler:  Encountered errors during assembly code generation.");
            e.printStackTrace();
            System.exit(INVALID_SOURCE_FILE);
        }
    }
}