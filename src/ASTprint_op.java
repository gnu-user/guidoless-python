/* Generated By:JJTree: Do not edit this line. ASTprint_op.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTprint_op extends SimpleNode {
  public ASTprint_op(int id) {
    super(id);
  }

  public ASTprint_op(Minimp p, int id) {
    super(p, id);
  }
  
  @Override
  public Object interpret()
  {
	  // Valid number of children
	  if(this.jjtGetNumChildren() == 1)
	  {
		  // Valid children are Integer or list
		  // Note that children can be a function call but must return a value
		  System.out.println(this.jjtGetChild(0).interpret());
	  }
	  
	  return null;
  }

}
/* JavaCC - OriginalChecksum=ee2ad75a776d96a9f52054744d76d62a (do not edit this line) */
