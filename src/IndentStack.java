import java.util.ArrayList;

public class IndentStack {

	private ArrayList<String> indentStack;
	
	public IndentStack()
	{
		indentStack = new ArrayList<String>();
	}
		
	public void pop()
	{
	    if(indentStack.size() > 0 )
	    {
	    	indentStack.remove(indentStack.size()-1);
	    }
	}
	
	public int reverseSearch(String element)
	{
    	for (int i = indentStack.size()-1; i >= 0; i--)
    	{
    		if(indentStack.get(i).equalsIgnoreCase(element))
      		{
    	  		return i;
      		}
    	}
    	return -1;
	}
	
	public int size()
	{
		return indentStack.size();
	}
	
	public String get(int index)
	{
		return indentStack.get(index);
	}
	
	public void push(String value)
	{
		indentStack.add(value);
	}
}
