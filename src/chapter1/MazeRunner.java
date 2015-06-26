//This Program has karel go through a maze with no islands.
//Ozaner Hansha
//Class 4
//Intro to Comp.Sci 1
package test;

public class MazeRunner extends CoolRobot {

	public MazeRunner(int street, int avenue, Direction direction, int beepers)
	{
		super(street, avenue, direction, beepers); 	
	}

	//Method to check if there is a right wall
	public boolean rightIsClear()
	{
		turnRight();
		if(frontIsClear())
		{
			turnLeft();
			return true;
		}
		else
		{
			turnLeft();
			return false;
		}
	}
	
	//Runs Program
	public void runProgram()
	{
		//keeps following right wall until there is a beeper.
		while(!nextToABeeper())
		{
			if(rightIsClear())
			{
				turnRight();
			}
			else
			{
				while(!frontIsClear())
					turnLeft();
			}
			move();
		}
		
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("maze.kwld");
		World.setVisible();
		World.showSpeedControl(true);
			
		//Creates robot and runs program
		MazeRunner mazebot = new MazeRunner(1,1,East,9001);
		mazebot.runProgram();
		mazebot.turnOff();
	}
}
