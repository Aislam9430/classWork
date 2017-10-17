package arrays;

import java.util.Arrays;

public class ArraysMain 
{	
	private String[] suits;
	private String[] values;
	private int[] testArray;

	public void arrayNotes() 
	{
		// 2wayz to make an array
		int[] firstWay = {0,1,2,3,4,5};
		// only works wit declaration
		String[] secondWay = new String[10];
		///secondWay[0] = 2;
		
		//2wayz to iterate thru an arrray
		/*for(int i = 0; i < secondWay.length;i++)
		{
			System.out.println("The number" + i + "elemement is" + secondWay[i]);
			
		}
		for(String value:secondWay)
		{
			System.out.println("element is" + value);
		}*/
		// Note: Primative arrays are autom-Populated
		// Object arrays are not populated(Nulll)
	}
	private int largestNumber(int[] arr)
	{
		
	}
	private int longestConsecutiveOrder(int[] arr)
	{
		int count = 0;
		int breaks = 0;
		int[] countArray = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			if(isConsecutiveOrder(arr) == true)
			{
				count++;
			}
			else
			{
				countArray[breaks] = count;
				count = 0;
				breaks++;
			}
		}
		
	}
	private boolean isConsecutiveOrder(int[] arr)
	{
		for(int i = 0; i < arr.length-1;i++)
		{
			if(arr[i] + 1 == arr[i+1])
			{
				return true;
			}
		}
		return false;
	}
	private void cycleThrough(int[] arr,int n)
	{
		for(int i = 0; i<n;i++)
		{
			frontToBack(arr);
		}
	}
	private void frontToBack(int[] arr)
	{
		int front = arr[0];
		for(int i = 0; i < arr.length-1; i++)
		{
			arr[i] = arr[i+1];
			
		}
		arr[arr.length-1] = front;
		
	}
	private int[] subArray(int[] arr, int psn, int length)
	{
		int[] newArray = new int[length];
		for(int i = psn; i < length; i++)
		{
			newArray[i-psn] = arr[psn];
		}
		return newArray;
				
	}
	public ArraysMain()
	{
		int[] testArray = new int[20];
		populate(testArray);
		
		
		
		/*suits = new String[4];
		suits[0] = "Clubs";  
		suits[1] = "Hearts";  
		suits[2] = "Diamonds ";  
		suits[3] = "Spades";  
		values[0] = "Ace";
		values[12] = "king";
		values[11] = "queen";
		values[10] = "jack";*/
		System.out.println(Arrays.toString(subArray(testArray,2,2)));
		/*populate1ToN(values);
		printDeck();*/

	}
	
	/*private void printDeck() 
	{
		for(String suit:suits)
		{
			for(String value : values)
			{
				System.out.println(value + " of " + suit);
			}
		}
		
	}
	private void shuffle(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			swap(arr,i,(int) (Math.random() * arr.length));
		}
	}
	private void swap(int[] arr, int i, int j) 
	{
		int placeholder = arr[i];
		arr[i] = arr[j];
		arr[j] = placeholder;
		
	}
	private void populate1ToN(String[] ar)
	{
		for(int i = 1; i <  10;i++)
		{
			ar[i] = Integer.toString(i);
		}
		
	}
	private void countOccurences(int[] arr, int start, int end)
	{
		int[] counter = new int[end - start + 1];
		for(int value: arr)
		{
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++)
		{
			System.out.println("The value" + " " + (i + start) + " "+ "was rolled" 
		+ " " + counter[i] + " " +  "times");
		}
		
	}*/
	private void populate(int[] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = i;
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
