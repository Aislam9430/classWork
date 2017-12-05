package search;

public class TowersOfHanoi 
{
	
	public static void main(String[] args)
	{
		 hanoi(3,"a","b","c");
	}
	public static void hanoi(int n, String start,String help,String end)
	{
		if(n == 1)
		{
			System.out.println(start + "to" + end);
		}
		else
		{
			hanoi(n-1,start,end,help);
			System.out.println(start + "to" + end);
			hanoi(n-1,help,start,end);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*enum Tower
	{
		START,
		HELPER,
		END
		
	}

	public TowersOfHanoi(int n) 
	{
		String start = "";
		for(int i = n; i > 1; i--) 
		{
			start += i;
		}
		solve(n, start, "", "");
	}
	
	public void solve(int n, String start, String helper, String end)
	{
		
		if(n == 1) 
		{
			if(start == "" && helper == "")
			{
				//Everything is empty then everything has been moved
				return;
			}
			else 
			{
				if(start != "" && helper == "") 
				{
					//if start is empty, it is time to start from the top
					solve(getTopNum(start), start, helper, end);
				}
				else 
				{
					// this condition should never be reached
				}
			}
		}
	
		if(start.length() != 0 && getTopNum(start) == n) 
		{
			//if things need to be moved from start moved them
			boolean moved = false;
			if(n % 2 == 0) 
			{
				//if even and can be moved, move to end
			}
			else
			{
				//if odd move and can be moved, move to helper
			}
			
			if(!moved)
			{
				
				//if it cannot move, move the smaller problem
				solve(n-1, start, helper, end);
			}
		}
		else if(getTopNum(helper) ==n || getTopNum(end) == n) 
		{
			//if the number is not at start
			//move it to the appropriate pile, depending where it fits
			if(getTopNum(helper) == n + 1) 
			{
				//move to helper
			}
			else if(getTopNum(end) == n + 1) 
			{
				//move to end
			}
		}
		else 
		{
			//if none of these are true then the layer on top needs to be moved before this layer can be moved
			solve(n-1, start, helper, end);
		}
	}
	
	public String removeEndChar(String s) 
	{
		return s.substring(0, s.length()-2);
	}
	
	public int getTopNum(String s) 
	{
		return Integer.parseInt(s.substring(s.length()-1,s.length()));
	}*/
}

