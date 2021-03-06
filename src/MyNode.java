/* Copyright (c) 2006, Sreenivasa Viswanadha <sreeni@viswanadha.net>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Sun Microsystems, Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.keyvalue.MultiKey;
import org.apache.commons.collections.map.MultiKeyMap;

/**
 * Specialised node.
 */
public class MyNode
{
    /** Multi-key hashmap used for the symbol table */
	protected static MultiKeyMap symtab = new MultiKeyMap();
	
	
	/**
	 * A method which is used to remove variables and functions from the
	 * symbol table when they are out of scope.
	 */
	protected void removeScope()
	{
		MapIterator mp = symtab.mapIterator();
	    ArrayList<String> variables = new ArrayList<String>();
	    
	    while(mp.hasNext())
	    {
		    MultiKey mult = ((MultiKey)mp.next());
		    if(mult.getKey(1) == scope)
		    {
		  	    variables.add(mult.getKey(0).toString());
		    }
	    }
	  
	    for(int i = 0; i < variables.size(); i++)
	    {
	    	symtab.remove(variables.get(i), scope);
	    }
	    scope--;
	}

  /** Scope depth */
  public static Integer scope = 0;
  
  /** Stack for calculations. */
  protected static Object[] stack = new Object[1024];
  protected static int top = -1;

  protected static Writer out = new PrintWriter(System.out);
  protected static Reader in = new InputStreamReader(System.in);

  /**
   * @param in the input to set
   */
  public static void setIn(Reader in) {
    MyNode.in = in;
  }

  /**
   * @param out the output to set
   */
  public static void setOut(Writer out) {
    MyNode.out = out;
  }

}
