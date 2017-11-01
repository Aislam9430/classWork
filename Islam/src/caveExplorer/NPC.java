
package caveExplorer;

public class NPC 
{
	private CaveRoom[][] floor;
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;

	public NPC() 
	{
		this.floor = CaveExplorer.caves;
		this.activeDescription =  "There is a person. press e to talk";
		this.inactiveDescription = "";
		
		this.currentCol = -1;
		this.currentRow = -1;
		currentRoom = null;
		active = true;
	}

	public boolean isActive() 
	{
		// TODO Auto-generated method stub
		return active;
	}

	public void interact()
	{
		CaveExplorer.print("Lets Interact! type bye to stop.");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye"))
		{
			CaveExplorer.print("I dont do that");
			s =  CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("later");
		active = false;
	}

	public String getDescription() 
	{
		// TODO Auto-generated method stub
		return activeDescription;
	}

	public String getInactiveDescription()
	{
		// TODO Auto-generated method stub
		return inactiveDescription;
	}

	public String getSymbol() 
	{
		// TODO Auto-generated method stub
		return "P";
	}

	public void setPosition(int row, int col) 
	{
		if(row >= 0 &&row < floor.length &&
		col >= 0 &&col < floor[row].length && floor[row][col] instanceof NPCRoom )
		{
			if(currentRoom != null)
			{
				currentRoom.leaveNPC();
			}
			currentRow = row;
			currentCol = col;
			//casr the caveRoom to NPCRoom
			currentRoom = (NPCRoom)floor[row][col];
			currentRoom.enterNPC(this);
		}
		
	}

}