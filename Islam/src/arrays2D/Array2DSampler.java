package arrays2D;

public class Array2DSampler 
{
	private String[][] picture;

	public Array2DSampler() 
	{

		String[][] picture = new String[10][20];
		printPicture(picture);

	}

	private void printPicture(String[][] picture) 
	{
		for(int row = 0; row < picture.length;row++)
		{
			for(int col = 0 ; col < picture[row].length;col++)
			{
				System.out.print(picture[row][col]);
			}
			System.out.println("");
		}
		for(String[] row: picture)
		{
			for(String col: row)
			{
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
