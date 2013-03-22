
public class VariableValue implements Node {

	private Integer value;
	
	public VariableValue(Integer value)
	{
		this.value = value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public void jjtOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jjtClose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jjtSetParent(Node n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node jjtGetParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void jjtAddChild(Node n, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node jjtGetChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int jjtGetNumChildren() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object interpret() {
		
		return value;
	}
	
	
}
