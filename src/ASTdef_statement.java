/* Generated By:JJTree: Do not edit this line. ASTdef_statement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTdef_statement extends SimpleNode {
	
	private Integer localScope;
	
  public ASTdef_statement(int id) {
    super(id);
  }

  public ASTdef_statement(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  
	  // If the function already exists
	  if(symtab.get(this.jjtGetValue().toString(), scope) == null)
	  {
	  	  // Add function node to hash table so it can be called later 
	  	  this.localScope = scope;
		  
		  symtab.put(((ASTarg_list)this.jjtGetChild(0)).getValue().toString(), this.localScope, this);
		  
		  return this.jjtGetChild(0);
	  }
	  // ERROR
	  return null;
  }

	public Integer getScope() {
		return localScope;
	}

}
/* JavaCC - OriginalChecksum=9e54365cc2c16b0828a03019a263de3b (do not edit this line) */
