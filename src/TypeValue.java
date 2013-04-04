
public abstract class TypeValue implements Node {

	public String address;
	public static final int COMPARE = 0;
	public static final int VAR = 1;
	
	public TypeValue(String address)
	{
		this.address = address;
	}
		
	@Override
	public Object interpret()
	{
		
		return address;
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
}
