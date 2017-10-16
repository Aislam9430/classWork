package arrays;

public class ArraysMain 
{	
	private int[] testArray;

	public void arrayNotes() 
	{
		// 2wayz to make an array
		int[] firstWay = {0,1,2,3,4,5};
		// only works wit declaration
		String[] secondWay = new String[10];
		///secondWay[0] = 2;
		
		//2wayz to iterate thru an arrray
		for(int i = 0; i < secondWay.length;i++)
		{
			System.out.println("The number" + i + "elemement is" + secondWay[i]);
			
		}
		for(String value:secondWay)
		{
			System.out.println("element is" + value);
		}
		// Note: Primative arrays are autom-Populated
		// Object arrays are not populated(Nulll)
	}
	public ArraysMain()
	{
		testArray = new int[50];
		populate(testArray);
	}

	private void populate(int[] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = diceRoll(i);
		}
		
	}
	public static void main(String[] args) 
	{
		ArraysMain sample = new ArraysMain();
		//1. Arrays are collections of Primatives and objects
		//SPECIAL NOTE: This is the ONLY collection of primituves.
		
		//2. Size cant be edited
		
		//3 The elements of the array are references to objects.
		//changing the element of arrays changes the references not the object
	}
	public int diceRoll(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++ )
		{
			sum += (int)(Math.random() * 6) + 1;
		}
		return sum;
	}
}
