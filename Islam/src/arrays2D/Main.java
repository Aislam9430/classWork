package arrays2D;

public class Main 
{

	public static void main(String[] args) 
	{
		String[][] picture = new String[10][20];
		printPicture(picture);

	}

	private static void changeNeighbors(int[] arr, int i)
	{
		arr[i] = arr[i] +1;
		if(i >= 1)
		{
			arr[i-1] = arr[i] - 1;
		}
		if(i <= 1)
		{
			arr[i + 1] = arr[i] + 1;
		}
	}

}
