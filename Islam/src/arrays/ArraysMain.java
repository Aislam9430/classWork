package arrays;

public class ArraysMain 
{

	public ArraysMain()
	{
	}

	public static void main(String[] args) 
	{

	}
	public int diceRoll(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++ )
		{
			sum += (int)(Math.random() * 6);
		}
		return sum;
	}
}
