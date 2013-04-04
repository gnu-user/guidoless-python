/* Generated By:JJTree: Do not edit this line. ASTProgram.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTProgram extends SimpleNode {
  public ASTProgram(int id) {
    super(id);
  }

  public ASTProgram(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	this.initStack();
	System.out.println("\t.globl main\n");
	System.out.println("\t.text\n");
	System.out.println("main:\n");
	
	for(int i = 0; i < this.jjtGetNumChildren(); i++)
	{
		(this.jjtGetChild(i)).interpret();
	}
	
	System.out.println("# Exit");
	System.out.println("li $v0, 10");
	System.out.println("syscall\n");
	
	System.out.println("\t.data");
	
	for(int i = 0; i < dataList.size(); i++)
	{
		System.out.println(dataList.get(i) + ": .word 0");
	}
	System.out.println(NEWLINE + ": .asciiz \"\\n\"");
	System.out.println(TRUE + ": .asciiz \"true\"");
	System.out.println(FALSE + ": .asciiz \"false\"");
	
	return null;
  }

}
/* JavaCC - OriginalChecksum=ceb42095fce009541b214156ce594b7f (do not edit this line) */
