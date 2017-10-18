package arrays;

public class Athelete extends Person
{
	private int money;
	
	public Athelete(String first, String last, Borough Home,int money) 
	{
		super(first,last,Home);
		this.money = money;
	}
	public String toString()
	{
		return super.toString() + " and "+ " " + "I also got $" + " " + money + "!";
	}

}
