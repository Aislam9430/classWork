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
	private int[] longestConsecutiveSeqAndIndex(int[] arr) 
	{
		int[] data = new int[2];
		data[0] = 1;
		int currentCount = 1;
		for(int i = 0; i < arr.length; i++) 
		{
			while(i + currentCount < arr.length && isConsecutive(arr, i, i+currentCount)) 
			{
				currentCount++;
			}
			if(currentCount > data[0])
			{
				data[0] = currentCount;
				data[1] = i;
			}
			i = i + currentCount-1;//saves time
			data[1] =i;
		}
		return data;
	}
	private int longestConsecutiveOrder(int[] arr)
	{
		int maxLength = 1;
		int currentCount = 1;
		for(int i = 0; i < arr.length; i++) 
		{
			while(i + currentCount < arr.length && isConsecutive(arr, i, i+currentCount)) 
			{
				currentCount++;
			}
			if(currentCount > maxLength)
			{
				maxLength = currentCount;
			}
			i = i + currentCount-1;//saves time
			currentCount = 1;
		}
		return maxLength;
	}
	
	private boolean isConsecutive(int[] arr,int start,int end)
	{
		for(int i = start; i < end; i++ ) 
		{
			if(arr[i] + 1 != arr[i+1]) 
			{
				return false;
			}
		}
		return true;
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
		wednesdayMethods();
	}
	
	private void wednesdayMethods() 
	{
		int[] diceRolls = new int[10000];
		populate(diceRolls);
		int[] data = longestConsecutiveSeqAndIndex(diceRolls);
		int longest = data[0];
		System.out.println("The Longest sequence is" + longest + "rolls." + "It happened on roll#" + data[1] + "The sequence was" + Arrays.toString(subArray)  );
		
		
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
			arr[i] = diceRoll(2);
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
