Minimp Compiler README
========================================

Building the Mimp Compiler
----------------------------------------

1.	On Windows computers the Mimp compiler can be built using the following
	commands, the Java class path to the library file MUST be provided.

	cd src/
	jjtree Minimp.jjt
	javacc Minimp.jj
	javac -cp .;../lib/commons-collections-3.2.1.jar *.java


2.	On Linux computers that have support for makefiles the Mimp compiler can
	be built using the following commands.

	cd src/
	make


3.	Alternatively, you can use the pre-built JAR file, Mimp.jar, which is
	located in the src/ directory, rather than building the Mimp compiler.




Compiling source files using Mimp
----------------------------------------

1.	To execute Mimp and compile source files written in Minimp navigate to
	the src/ directory and run Mimp using java and provide it the path to your 
	Minimp source file and the file name for the resultant assembly file you
    want generated. The generated assembly file can then be executed with the
    MIPS emulator, SPIM in order to evaluate the results.

    Please note, the Java class path to the library MUST be provided.


2.	On Windows the Mimp compiler can be executed using the following
	commands. Please note the semicolon ";" used as a separator in the classpath.

		cd src/
		java -cp .;../lib/commons-collections-3.2.1.jar Mimp [source_file] [output_file]

	For example, using our while_1.mim source file to generate while_1.asm:

		cd src/
		java -cp .;../lib/commons-collections-3.2.1.jar Mimp ../test/while_1.mim while_1.asm


3.	On Linux machines the Mimp compiler can be executed using the following
	commands. Please note the colon ":" used as a separator in the classpath.

		cd src/
		java -cp .:../lib/commons-collections-3.2.1.jar Mimp [source_file] [output_file]

	For example, using our while_1.mim source file to generate while_1.asm:

		cd src/
		java -cp .:../lib/commons-collections-3.2.1.jar Mimp ../test/while_1.mim while_1.asm


4.	Alternatively, the Mimp compiler can simply be executed using the included
	Mimp.jar JAR file, which has already been built and includes the library file.

		cd src/
		java -jar Mimp.jar [source_file] [output_file]

	For example, using our while_1.mim source file to generate while_1.asm:

		cd src/
		java -jar Mimp.jar ../test/while_1.mim while_1.asm


5.	Mimp requires that the source file provided exists and that it conforms to the Minimp
	grammar, if an error occurs Minimp will return one of the following error codes.

		-1  -- An error occurred during the lexical analysis/parsing/compilation 
			   the source file is invalid
		-2	-- The source file provided as an argument does not exist
		-3	-- Invalid command line arguments provided to Mimp
        -4  -- A write failure occurred writing the assembly file to disk.

6.	If the source file provided to Mimp was parsed and compiled into an assembly
    file successfully, the output from the compilation will be displayed to the 
    terminal. As well the following exit code is returned.

		 0  -- The source file is valid and was compiled successfully




Running the Mimp test suite
----------------------------------------

*** PLEASE NOTE ***
In order to execute the test suite you must be using Linux, have the command
line version of the SPIM emulator installed, and the command line diff tool.


1.	Mimp includes a comprehensive test suite to verify that the compiler is able 
    to parse the Minimp language successfully and generate a semantically valid
    assembly output file. The test framework compiles each of the test input
    files and then evaluates the generated assembly file with the MIPS emulator
    and compares the output (using diff) with the expected output in the *.out
    files that are located in the folders containing the tests.


2.	The test/ directory includes a wide variety of the default tests, which are 
	designed to test all of the various aspects of the syntax and grammar for the 
	Minimp language. The Assignment3Tests directory contains the test files from
    assignment 3.


3.	To execute the default test suite for Mimp, on a Linux machine (using the bash
	shell) execute the test suite as follows:

		chmod +x test_suite.sh
		./test_suite.sh


4.	To execute the Mimp test suites for assignment 3 on a Linux machine 
	(using the bash shell) execute the test suite with the argument "3" such
	as the following example:

	chmod +x test_suite.sh
	./test_suite.sh 3


5.	The test suite will test the Mimp compiler on all of the Minimp source file tests
	directory, all tests that passed will output a message in green "Test ... PASSED!"
 	any tests that failed will output a message in red "Test ... FAILED!" 
    Lastly, any tests where the generated assembly output file executes differently
    that expected results in a message in yellow "Assembly Output ... FAILED!"


