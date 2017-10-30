package caveExplorer;

public class TwoDArrayPractice 
{

	public static void main(String[] args)
	{
		String[][] pic = new String[6][10];
		for(String[] row:pic)
		{
			for(int col = 0; col < row.length;col++)
			{
				row[col] = " ";
			}
		}
//		drawHorizontalLine(pic,2);
//		drawVerticalLine(pic,3);
		//	drawSlot(pic,4,6);
		drawBox(pic,5,8);
		print(pic);
	
	
	}

	private static void drawBox(String[][] pic, int row, int col) 
	{
		drawSlot(pic,row,col);
		drawSlot(pic,row+1,col);
		for(int i = col -1; i <= row+1; i++ )
		{
			drawAt("_",pic,i,col);
		}
		
	}

	private static void drawAt(String string, String[][] pic,
	int row, int col) 
	{
		if(row>=0 && row < pic.length && col>= 0 
		&& col < pic[row].length)
		{
			pic[row][col] = string;
		}
	}

	private static void drawUnder(String[][] pic, int j)
	{
		for(int i = 0; i < pic[j].length;i++)
		{
			pic[j][i] = "_";
		}
		
	}

	private static void drawSlot(String[][] pic, int i, int j) 
	{
		if(j > 0)
		{
			pic[i][j-1] = "|";
		}
		if(j < pic[i].length-1)
		{
			pic[i][j+1] = "|";
		}
		
	}

	private static void drawVerticalLine(String[][] pic, int col) 
	{
		for(int row = 0; row < pic.length;row++)
		{
			pic[col][row] = "|";
		}
	}

	private static void drawHorizontalLine(String[][] pic, int row) 
	{
		for(int i = 0; i < pic[row].length;i++)
		{
			pic[row][i] = "-";
		}
		
	}

	private static void print(String[][] twoArr) 
	{
		for(int row = 0; row < twoArr.length; row++)
		{
			for(int col = 0; col < twoArr[row].length;col++)
			{
				System.out.print(twoArr[row][col]);
				System.out.println(" ");
			}
		}
		
	}

}
