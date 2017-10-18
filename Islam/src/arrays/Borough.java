package arrays;

public class Borough 
{
	public static final Borough[] NY_Borough = {new Borough("Brooklyn"),new Borough("Brooklyn"),new Borough("Queens"),
		new Borough("Manhattan"), new Borough("Bronx")};
	
	
	private String name;

	public Borough(String name) 
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
}
