package search;
import java.util.Scanner;
import java.util.Timer;

public class Searching 
{

	Scanner in;
	int[] numbers;
	public static final int HANDICAP= 10;
 
	public static void main(String[] args)
	{
		System.out.println("Loading text ints...");
		Searching s = new Searching(); 
 
	}
 
	
	public Searching() {
		in = new Scanner(System.in);
		String s= new StringFromFileLoader("Data/ints.txt").getFileContent();
		String[] text =s.split(", "); 
		numbers = new int[text.length];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i]=Integer.parseInt(text[i]);
		}
		proceedWithSearch();
	}

	private void proceedWithSearch() 
	{
		System.out.println("Loaded " + numbers.length+" ints. Enter a value between 0 and "+numbers[numbers.length-1]);
		int target = -1;
		while(target==-1)
		{
			try
			{
				target = Integer.parseInt(in.nextLine());
				if(target <=0 || target >= numbers[numbers.length-1])System.out.println("Follow instructions, please. Enter a value between 0 and "+numbers[numbers.length-1]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Follow instructions, please. Enter a value between 0 and "+numbers[numbers.length-1]);
			} 
	
		System.out.println("Get ready to race the computer. \n"
				+ "It's okay, the computer has been set to take "+HANDICAP+" ms for every iteration in its search algorithm.\n"
				+ "Try to find the number "+target+"."
				+ "\n    Press 'enter' to begin.");
		in.nextLine();
		int index = search(numbers, target, 0, numbers.length-1);
		if(index!=-1)
		{
			System.out.println("The number "+target+" was found at index "+index+". Did the computer win?");
		}
		else
		{
			System.out.println("The number "+target+" was not found in the file.");
		}
	}
 
 }


	private int search(int[] searchThis, int startIndex, int endIndex,int target)
	{
		int middle = (startIndex + endIndex)/2;
		if(searchThis[middle] == target)
		{
			return searchThis[middle]; 
		}
		if(startIndex == middle && endIndex == middle)
		{
			return -1;
		}
		else
		{
			if(target < searchThis[middle])
			{
				return search(searchThis,startIndex,middle,target);
			}
			else if(target > searchThis[middle])
			{
				search(searchThis,middle,endIndex,target);
			}
		}
		return -1;
	}
 
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	private void delay(int handicap2)
	{
		try 
		{
			Thread.sleep(HANDICAP);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}