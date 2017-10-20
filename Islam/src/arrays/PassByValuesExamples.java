package arrays;

import java.util.Arrays;

public class PassByValuesExamples 
{

	public static void main(String[] args) 
	{
		String s = "hello";
		int x = 5;
		Person p = new Person("random","dude",Borough.NY_Borough[0]);
		int[] arr = {1,2,3};
		test1(p,x,arr);
		test3(arr);
		System.out.println("p is now" + p + "x is" +  x + "arr is" + Arrays.toString(arr));
	}

	private static void test1(Person p, int x, int[] arr) 
	{
		p.setFirstName("Orignal");
		
	}
	private static void test3(int[] arr)
	{
		arr[0] = 69;
		arr[1] = 998;
				
	}
	private static void changeEVERYTHING(String s, int x, int[] arr)
	{
		s = "goodbye";
		x = -5;
		arr = new int[2];
		arr[0] = -1;
		arr[1] = -2;
		
	}

}
