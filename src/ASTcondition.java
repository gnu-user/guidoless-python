/* Generated By:JJTree: Do not edit this line. ASTcondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTcondition extends SimpleNode {
  public ASTcondition(int id) {
    super(id);
  }

  public ASTcondition(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  if(this.jjtGetNumChildren() == 2)
	  {
		  //TODO fix to allow for returns in functions
		  Object ifReturn = this.jjtGetChild(0).interpret();
		  //if(ifReturn == null)
		  //{
		  Object elseReturn = this.jjtGetChild(1).interpret();
		  
		  asmBuffer.add("if_" + ifReturn.toString() + ": nop");
		  //}
		  return elseReturn;
		  
		  //return ifReturn;
	  }
	  
	  // Error
	  return null;
  }

}
/* JavaCC - OriginalChecksum=4ef335e88e1cca00bbeda5ed2ddf8aef (do not edit this line) */
