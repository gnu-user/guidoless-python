
public class VariableValue extends TypeValue {

	public VariableValue(String address)
	{
		super(address);
	}
	
	@Override
	public String toString()
	{
		return address;
	}
	
}
