//This Program has karel go through a path and placing beepers if she determines if she is in a room
//Ozaner Hansha
//Class 4
//Intro to Comp.Sci 1package kareltherobot;
package test;
public class SmallRoomCarpenter extends CoolRobot 
{

	public SmallRoomCarpenter(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers); 
		
	}

	//Method to check if there is an North Wall
	public boolean NWallIsThere()
	{
		turnNorth();
		if (frontIsClear())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	//Method to check if there is an East Wall
	public boolean EWallIsThere()
	{
		turnEast();
		if (frontIsClear())
		{
			turnSouth();
			return false;
		}
		else
		{
			turnSouth();
			return true;
		}
	}
	
	//Method to check if there is an West Wall
	public boolean WWallIsThere()
	{
		turnWest();
		if (frontIsClear())
		{
			turnSouth();
			return false;
		}
		else
		{
			turnSouth();
			return true;
		}
	}
	
	//Method to check if there is a room
	public boolean thereIsRoom()
	{
		if (NWallIsThere())
		{
			if (EWallIsThere())
			{
				if (WWallIsThere())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	
	//Method to move along the Line
	public void moveAlong()
	{
		move();
		turnLeft();
		move();
		if (thereIsRoom())
		{
			putBeeper();
		}
		move();
		turnLeft();
	}
	
	//Add Method Run Program
	public void runProgram()
	{
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		moveAlong();
		turnOff();
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("smallroomsworld1");
		World.setVisible();
		World.showSpeedControl(true);
			
		//Creates robot and runs program
		SmallRoomCarpenter carpenterbot = new SmallRoomCarpenter(1,1,East,8);
		carpenterbot.runProgram();
	}
}