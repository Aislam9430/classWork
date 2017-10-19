package arrays;

public class ObjectMain 
{

	public ObjectMain() 
	{
		Person[] people = new Person[120];
		populate(people);
		Person[] group = selectGroup(people,120);
		analyzeCommonalities(people,group);
		
	}
	private void analyzeCommonalities(Person[] people, Person[] group) 
	{
		double averageCommonalities = 0;
		double trials = 500;
		double totalCount = 0;
		for(int i = 0; i < trials;i++)
		{
			group = selectGroup(people,people.length);
			totalCount += countCommonalities(people,group);
		}
		averageCommonalities = totalCount/500;
		System.out.println(averageCommonalities);
		
	}
	private int countCommonalities(Object[] arr1,Object[] arr2)
	{
		int count = 0;
		for(int i = 0; i < arr1.length;i++)
		{
			if(arr1[i] == arr2[i])
			{
				count++;
			}
		}
		return count;
	}
	public Person[] selectGroup(Person[] population,int length)
	{
		Person[] group = new Person[length];
		for(int i = 0; i < group.length;i++)
		{
			Person toAdd = randomPerson(population);
			while(alreadyContains(group,toAdd))
			{
				toAdd = randomPerson(population);
			}
			group[i] = toAdd;
		}
		return group;
	}
	private boolean alreadyContains(Person[] group, Person person) 
	{
		for(int i = 0; i < group.length;i++)
		{
			if(group[i] == person)
			{
				return true;
			}
		}
		return false;
	}		
	private Person randomPerson(Person[] population) 
	{
		return population[(int)(Math.random()* population.length)];
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
