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
  
  /**
   * The root node of the AST which is interpreted, it returns a buffer 
   * containing the generated MIPS assembly code.
   * 
   * @return ArrayList<String> containing the generated MIPS assembly code
   */
  public Object interpret()
  {
	initStack();
	asmBuffer.add(".globl main\n");
	asmBuffer.add(".text\n");
	asmBuffer.add("main:\n");
	
	for(int i = 0; i < this.jjtGetNumChildren(); i++)
	{
		(this.jjtGetChild(i)).interpret();
	}
	
	asmBuffer.add("# Exit");
	asmBuffer.add("li $v0, 10");
	asmBuffer.add("syscall\n");
	
	asmBuffer.add(".data");
	
	for(int i = 0; i < dataList.size(); i++)
	{
		asmBuffer.add(dataList.get(i) + ": .word 0");
	}
	asmBuffer.add(NEWLINE + ": .asciiz \"\\n\"");
	asmBuffer.add(TRUE + ": .asciiz \"true\"");
	asmBuffer.add(FALSE + ": .asciiz \"false\"");
	asmBuffer.add(SLEFTB + ": .asciiz \"[\"");
	asmBuffer.add(SRIGHTB + ": .asciiz \"]\"");
	asmBuffer.add(SPACE + ": .asciiz \" \"");
	
	return null;
  }

}
/* JavaCC - OriginalChecksum=ceb42095fce009541b214156ce594b7f (do not edit this line) */
