//Ozaner Hansha
//Intro to Comp. Sci 1 - Period 4
//10/1/2014
//Gardener

package test;

public class Gardener extends UrRobot
{

	public Gardener(int street, int avenue, Direction direction, int beepers) 
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
	
	//Adds Method Move Three
	public void moveThree()
	{
		move();
		move();
		move();
	}
	
	//Adds Method Move Corner
	public void moveCorner()
	{
		moveThree();
		putBeeper();
		turnLeft();
		moveThree();
		turnRight();
		move();
		turnRight();
	}
	
	//Adds Method Move Four Corner
	public void moveFourCorner()
	{
		moveThree();
		putBeeper();
		turnLeft();
		moveThree();
		turnRight();
		move();
		turnRight();
	}
	
	//Adds Method Run Program 
	public void runProgram()
	{
		turnLeft();
		moveThree();
		turnLeft();
		moveFourCorner();
		turnOff();
	}
	
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Gardener");
		World.setVisible();
		World.showSpeedControl(true);
				
		//Creates robot and runs program
		Gardener gardenbot = new Gardener(2,2,South,4);
		gardenbot.runProgram();
	}
	
}