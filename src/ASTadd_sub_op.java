/* Generated By:JJTree: Do not edit this line. ASTadd_sub_op.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTadd_sub_op extends SimpleNode {
  public ASTadd_sub_op(int id) {
    super(id);
  }

  public ASTadd_sub_op(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  if(this.jjtGetNumChildren() == 2)
	  {
		  String regTemp = regValues.pop();
		  if(this.jjtGetValue().toString().equalsIgnoreCase("+"))
		  {
			  Object returnValue = this.jjtGetChild(0).interpret();
			  String regValue;
			 
			  try
			  {
				  Integer.valueOf(returnValue.toString());
				  regValue = regValues.pop();
				  System.out.println("li " + regValue + ", " + returnValue);
			  }
			  catch (Exception e)
			  {
				  regValue = returnValue.toString();
			  }
			  
			  System.out.println("add " + regTemp + ", " + regValue + ", " +
					  this.jjtGetChild(1).interpret().toString());
			  
			  regValues.push(regValue);
			  
			  return regTemp;
			  
			  //return Integer.valueOf(this.jjtGetChild(0).interpret().toString()) +
				//	  Integer.valueOf(this.jjtGetChild(1).interpret().toString()); 
		  }
		  else if(this.jjtGetValue().toString().equalsIgnoreCase("-"))
		  {
			  Object returnValue = this.jjtGetChild(0).interpret();
			  String regValue;
			 
			  try
			  {
				  Integer.valueOf(returnValue.toString());
				  regValue = regValues.pop();
				  System.out.println("li " + regValue + ", " + returnValue);
			  }
			  catch (Exception e)
			  {
				  regValue = returnValue.toString();
			  }
			  
			  System.out.println("sub "+ regTemp + ", " +  regValue + ", " + 
					  this.jjtGetChild(1).interpret().toString());
			  
			  regValues.push(regValue);
			  
			  return regTemp;
			  
			  //return Integer.valueOf(this.jjtGetChild(0).interpret().toString()) -
				//	  Integer.valueOf(this.jjtGetChild(1).interpret().toString());
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
/* JavaCC - OriginalChecksum=aa8276b9aa190ca71f9e7c0d26b45c18 (do not edit this line) */
