package test;

public class SimpleHurdle extends CoolRobot
{

	public SimpleHurdle(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);	
	}
	
	//Adds Jump Hurdle Method
	public void jumpHurdle()
	{
		turnLeft();
	}
	
	//Adds Jump Hurdle Method
	public void runBlock()
	{
		if(frontIsClear())
		{
			move();
		}
		else
		{
			jumpHurdle();
		}
	}
	//Adds Jump Hurdle Method
	public void runProgram()
	{
		runBlock();
		runBlock();
		runBlock();
		runBlock();
		runBlock();
		runBlock();
		runBlock();
		runBlock();
	}
	
	//The Main Method
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Hurdle");
		World.setVisible();
		World.showSpeedControl(true);
							
		//Creates robot and runs program
		SimpleHurdle hurdlebot = new SimpleHurdle(1,1,East,0);
		hurdlebot.runProgram();
		hurdlebot.turnOff();
	}
	
}