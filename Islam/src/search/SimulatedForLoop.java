package search;

public class SimulatedForLoop {

	public static void main(String[] args) 
	{
		forLoop(10,new Action() 
		{
			int count = 0;
			
			public void act() 
			{
				System.out.println(count + ". Hello World!");
				count++;
				
			}
		});
	}
	public static void forLoop(int n , Action a)
	{
		/*if(n == 0)
		{
			
		}
		else
		{*/
			a.act();
			forLoop(n-1,a);
		///}
	}
}
