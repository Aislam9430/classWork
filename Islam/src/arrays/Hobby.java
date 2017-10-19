package arrays;

public class Hobby extends Thing 
{

	public Hobby(String des) 
	{
		super(des);
		
	}

	public static Hobby randomHobby() 
	{
		Hobby[] h = {new Hobby("Listening to rap music"), new Hobby("Watch anime"), new Hobby("programming in python")};
		return h[(int)(Math.random()* h.length)];
	}

}
