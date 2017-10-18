package arrays;

public class ObjectMain 
{

	public ObjectMain() 
	{
		Object[] people = new Person[12];
		populate(people);
		people[0] = new Thing("toaster oven");
		for(Object p:people)
		{
			System.out.println(p.toString());
		}
		
	}
	private void populate(Object[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			String firstName = randomNameFrom(Person.FIRST_START,
			Person.FIRST_MIDDLE,Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START,
			Person.LAST_MIDDLE,Person.LAST_END);
			Borough home = randomBorough();
			//In an object array multiple data types ARE ALLOWED 
			if(Math.random() < .6)
			{
				arr[i] = new Person(firstName,lastName,home);
			}
			else
			{
				int money = (int)(Math.random()*20+1)*1000000;
				arr[i] = new Athelete(firstName,lastName,home,money);
			}
			
		}
		
	}
	private Borough randomBorough() 
	{
		return Borough.NY_Borough[(int)(Math.random()*
		Borough.NY_Borough.length)];
	}
	private String randomNameFrom(String[] a, String[] b, String[] c) 
	{
		return get(a) + get(b) + get(c);
	}
	private String get(String[] a) 
	{
		return a[(int)(Math.random()*a.length)];
	}
	public static void main(String[] args)
	{
		ObjectMain obj = new ObjectMain();
	}

}
