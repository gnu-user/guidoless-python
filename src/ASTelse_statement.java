/* Generated By:JJTree: Do not edit this line. ASTelse_statement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTelse_statement extends SimpleNode {
  public ASTelse_statement(int id) {
    super(id);
  }

  public ASTelse_statement(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  if(this.jjtGetNumChildren() > 0)
	  {
		  scope++;
		  
		  for(int i = 0; i < this.jjtGetNumChildren(); i++)
		  {
			  this.jjtGetChild(i).interpret();
		  }
		  scope--;
		  return null;

	  }
	  
	  // Error
	  return null;
  }
  
}
/* JavaCC - OriginalChecksum=215fb746e4811cb9d39d24c4fed2ad32 (do not edit this line) */
