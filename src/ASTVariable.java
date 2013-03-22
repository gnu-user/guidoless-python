/* Generated By:JJTree: Do not edit this line. ASTVariable.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTVariable extends SimpleNode {
  public ASTVariable(int id) {
    super(id);
  }

  public ASTVariable(Minimp p, int id) {
    super(p, id);
  }

  public Object interpret()
  {
	  /* 
	   * This method will identify whether the variable exists or not and will
	   *  call add look it up in the syntax table.
	   */ 
	  if(this.jjtGetNumChildren() == 0)
	  {
		  /* TODO Throw an exception if variable is not in the table */
		  if (! symtab.containsKey(this.jjtGetValue().toString()))
		  {
			  // ERROR
			  System.err.println("Undefined variable : " + this.jjtGetValue().toString());
			  return null;
		  }
		  
		  /* return the value of the variable */
		  return symtab.get(this.jjtGetValue());
	  }
	  
	  return null;
  }

}
/* JavaCC - OriginalChecksum=84dba81f3f659658cbbdaac564ed91b4 (do not edit this line) */