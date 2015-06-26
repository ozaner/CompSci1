package test;

public class CoolRobot extends Robot
{	
	public CoolRobot(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);
	
	}
	
	//Adds Method Turn Right
	public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	//Adds Method Turn Around
	public void turnAround()
	{
		turnLeft();
		turnLeft();
	}
	
	//Adds Method Turn North
	public void turnNorth()
	{
		while (!facingNorth())
		{
			turnLeft();
		}
	}
	
	//Adds Method Turn West
	public void turnWest()
	{
		while (!facingWest())
		{
			turnLeft();
		}
	}
	
	//Adds Method Turn East
	public void turnEast()
	{
		while (!facingEast())
		{
			turnLeft();
		}
	}
	
	//Adds Method Turn South
	public void turnSouth()
	{
		while (!facingSouth())
		{
			turnLeft();
		}
	}
}
