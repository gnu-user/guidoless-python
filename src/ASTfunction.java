import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/* Generated By:JJTree: Do not edit this line. ASTfunction.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTfunction extends SimpleNode {
  public ASTfunction(int id) {
    super(id);
  }

  public ASTfunction(Minimp p, int id) {
    super(p, id);
  }
  
  public Object interpret()
  {
	  // this.jjtGetValue().toString() is in the hashmap
	  //System.out.println(this.jjtGetValue().toString());
	  HashMap<String, Object> parameterValues = new HashMap<String, Object>();
	  
	  ASTdef_statement function = null;
	  for (int i = scope; i >= 0; i--)
	  {
		  
		  function = (ASTdef_statement) symtab.get(this.jjtGetValue().toString(), i);
		  if(function != null)
		  {
			  break;
		  }
	  }
	  
	  // TODO check for parent defs.
	  //System.out.println("right hwere");
	  for(int i = 0; i < function.parents.size(); i++)
	  {
		  Iterator iterator = function.parents.get(i).prevValues.entrySet().iterator();
		  while(iterator.hasNext())
		  {
			  Map.Entry entry = (Map.Entry)iterator.next();
			  
			  try {
				  VariableValue result = new VariableValue(Integer.valueOf(entry.getValue().toString()));
				  symtab.put(entry.getKey(), scope+1, result);
				  parameterValues.put(entry.getKey().toString(), result);
			  }
			  catch (NumberFormatException e) {
				  symtab.put(entry.getKey(), scope+1, (Node)entry.getValue());
				  parameterValues.put(entry.getKey().toString(), entry.getValue());
			  }
		  }
	  }
	  
	  scope++;
	  {
		  
		  // Scope check
		  // Map the variable values to the values of the list
		  String[] var = ((String[]) function.jjtGetChild(0).interpret());
		  //Decrement the scope for the variable binding.
		  scope--;
		  for(int i = 0; i < this.jjtGetNumChildren(); i++)
		  {
			  //symtab.put(scope, function.jjtGetChild(i).interpret(), this.jjtGetChild(i).interpret().toString());
			  
			  //System.out.println("Var " + var[i] + " value = " + this.jjtGetChild(i).interpret().toString());
			  Object parameter = this.jjtGetChild(i).interpret();
			  
			  try {
				  VariableValue result = new VariableValue(Integer.valueOf(parameter.toString()));
				  symtab.put(var[i], scope+1, result);
				  parameterValues.put(var[i], result);
			  }
			  catch (NumberFormatException e) {
				  //Node a = (Node)parameter;
				  //System.out.println(a);
				  //System.out.println(((ASTarg_list)((Node)parameter).jjtGetChild(0)).getValue().toString());
				  symtab.put(var[i], scope+1, (Node)parameter);
				  parameterValues.put(var[i], parameter);
			  }
			 
		  }
		  
		  function.prevValues = parameterValues;
		  
		  scope++;
		  
		  // Iterate through children (starting after the arguments list)		
		  for(int i = 1; i < function.jjtGetNumChildren(); i++)
		  {
			  // Each child should return null unless it is a return statement
			  Object returnValue = function.jjtGetChild(i).interpret();
			  
			  if(returnValue != null)
			  {
				  removeScope();
				  return returnValue;
			  }
		  }
		  
		  removeScope();
		  
		  // Success
		  return null; 
	  }
  }
}
/* JavaCC - OriginalChecksum=479d54a2631403e8e4deee571653b75d (do not edit this line) */
