/* Generated By:JJTree: Do not edit this line. ASTcomp_op.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTcomp_op extends SimpleNode {
  public ASTcomp_op(int id) {
    super(id);
  }

  public ASTcomp_op(Minimp p, int id) {
    super(p, id);
  }

  public Object interpret()
  {
	  if(this.jjtGetNumChildren() == 2)
	  {
		  if(this.jjtGetValue().toString().equalsIgnoreCase(">"))
		  {			
			  return (Boolean) (Integer.valueOf(this.jjtGetChild(0).interpret().toString()) >
			  		  Integer.valueOf(this.jjtGetChild(1).interpret().toString())); 
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase("<"))
		  {
			  return (Boolean) (Integer.valueOf(this.jjtGetChild(0).interpret().toString()) < 
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString()));
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase("<="))
		  {
			  return (Boolean) (Integer.valueOf(this.jjtGetChild(0).interpret().toString()) <= 
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString()));
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase(">="))
		  {
			  return (Boolean) (Integer.valueOf(this.jjtGetChild(0).interpret().toString()) >= 
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString()));
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase("=="))
		  {
			  return (Boolean) (Integer.valueOf(this.jjtGetChild(0).interpret().toString()) == 
					  Integer.valueOf(this.jjtGetChild(1).interpret().toString()));
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
/* JavaCC - OriginalChecksum=1c73793fe55587ce1f2d5311750b72ea (do not edit this line) */