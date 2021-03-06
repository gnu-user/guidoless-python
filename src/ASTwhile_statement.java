import java.util.ArrayList;

import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.keyvalue.MultiKey;

/* Generated By:JJTree: Do not edit this line. ASTwhile_statement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTwhile_statement extends SimpleNode {
  public ASTwhile_statement(int id) {
    super(id);
  }

  public ASTwhile_statement(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  if(this.jjtGetNumChildren() > 1)
	  {
		  // Check the condition of the while loop
		  scope++;
		  while(Boolean.valueOf(this.jjtGetChild(0).interpret().toString()))
		  {
			  for(int i = 1; i < this.jjtGetNumChildren(); i++)
			  {
				  Object returnValue = this.jjtGetChild(i).interpret();
				  
				  if(returnValue != null)
				  {
					  removeScope();
					  return returnValue;
				  }
			  }
		  }
		  
		  removeScope();
		  return null;
	  }
	  
	  // Error
	  return null;
  }

}
/* JavaCC - OriginalChecksum=65064f961399a0b14d977d8869469cf0 (do not edit this line) */
