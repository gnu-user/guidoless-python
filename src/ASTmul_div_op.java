/* Generated By:JJTree: Do not edit this line. ASTmul_div_op.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTmul_div_op extends SimpleNode {
  public ASTmul_div_op(int id) {
    super(id);
  }

  public ASTmul_div_op(Minimp p, int id) {
    super(p, id);
  }

  public Object interpret()
  {
	  if(this.jjtGetNumChildren() == 2)
	  {
		  if(this.jjtGetValue().toString().equalsIgnoreCase("*"))
		  {			
			  return Integer.valueOf(this.jjtGetChild(0).interpret().toString()) *
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString()); 
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase("/"))
		  {
			  return Integer.valueOf(this.jjtGetChild(0).interpret().toString()) /
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString());
		  }
		  else
		  {
			  // ERROR
			  return null;
		  }
		  
	  }
	  
	  // ERROR	  
	  return null;
  }

}
/* JavaCC - OriginalChecksum=2aa6de102b86dff7b73bc34103216fd3 (do not edit this line) */