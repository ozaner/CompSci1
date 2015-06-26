//Ozaner Hansha
//Intro to Comp. Sci 1 - Period 4
//10/1/2014
//Clock (20Pts.)
package test;

public class Clockworker extends UrRobot
{
	public Clockworker(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);
		
	}
	
	//Basic Methods
	
	//Adds Method Turn Right
	public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	//Adds Method Move then Put Beeper
	public void movePutBeeper()
	{
		move();
		putBeeper();
	}
	
	//Adds Method Move Twice
	public void moveTwo()
	{
		move();
		move();
	}
	
	//Adds Method Move then Put Beeper Twice
	public void movePutBeeperTwo()
	{
		movePutBeeper();
		movePutBeeper();
	}
	
	//Adds Method Turn Around
	public void turnAround()
	{
		turnLeft();
		turnLeft();
	}
	
	
	
	//Put Line Methods. 
	//---Spaces In between the methods indicate the return of the robot to Original Position.
	
	//Adds Put Top Line Method
	public void topLine()
	{
		moveTwo();
		moveTwo();
		turnRight();
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		turnLeft();
		moveTwo();
		moveTwo();
		turnAround();
	}
	
	//Adds Put Top Line Method
	public void topLeftLine()
	{
		moveTwo();
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		moveTwo();
		turnAround();
	}
	
	//Adds Put Top Line Method
	public void topRightLine()
	{
		turnRight();
		moveTwo();
		turnLeft();
		moveTwo();
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		moveTwo();
		turnRight();
		moveTwo();
		turnRight();
	}
	
	//Adds Put Middle Line Method
	public void middleLine()
	{
		moveTwo();
		turnRight();
		putBeeper();
		movePutBeeperTwo();
			
		turnAround();
		moveTwo();
		turnLeft();
		moveTwo();
		turnAround();
	}
	
	//Adds Put Middle Line Method
	public void bottomLine()
	{
		turnRight();
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		turnRight();
	}
	
	//Adds Put Middle Line Method
	public void bottomLeftLine()
	{
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		turnAround();
	}
	
	//Adds Put Middle Line Method
	public void bottomRightLine()
	{
		turnRight();
		moveTwo();
		turnLeft();
		putBeeper();
		movePutBeeperTwo();
		
		turnAround();
		moveTwo();
		turnRight();
		moveTwo();
		turnRight();
	}
	
	
	
	//Number Methods
	
	//Adds Method for #1
	public void one()
	{
		topRightLine();
		bottomRightLine();
	}
	
	//Adds Method for #2
	public void two()
	{
		topLine();
		topRightLine();
		middleLine();
		bottomLeftLine();
		bottomLine();
	}
	
	//Adds Method for #3
	public void three()
	{
		topLine();
		topRightLine();
		middleLine();
		bottomRightLine();
		bottomLine();
	}
		
	//Adds Method for #4
	public void four()
	{
		topLeftLine();
		topRightLine();
		middleLine();
		bottomRightLine();
	}
	
	//Adds Method for #5
	public void five()
	{
		topLine();
		topLeftLine();
		middleLine();
		bottomRightLine();
		bottomLine();
	}
		
	//Adds Method for #6
	public void six()
	{
		topLine();
		topLeftLine();
		middleLine();
		bottomLeftLine();
		bottomLine();
	}
		
	//Adds Method for #7
	public void seven()
	{
		topLine();
		topLeftLine();
		bottomLeftLine();
	}
		
	//Adds Method for #8
	public void eight()
	{
		topLine();
		topLeftLine();
		topRightLine();
		middleLine();
		bottomLeftLine();
		bottomRightLine();
		bottomLine();
	}
		
	//Adds Method for #9
	public void nine()
	{
		topLine();
		topRightLine();
		topLeftLine();
		middleLine();
		bottomRightLine();
	}
		
	//Adds Method for #0
	public void zero()
	{
		topLine();
		topLeftLine();
		topRightLine();
		bottomLeftLine();
		bottomRightLine();
		bottomLine();
	}
	
	
	
	//Move Digit Methods
	
	//Adds Method Move to Digit 4
	public void moveDigitTwo()
	{
		turnRight();
		moveTwo();
		moveTwo();
		turnLeft();
	}
	
	//Adds Method Move to Digit 4
	public void moveDigitThree()
	{
		turnRight();
		moveTwo();
		moveTwo();
		moveTwo();
		turnLeft();
	}
		
	//Adds Method Move to Digit 4
	public void moveDigitFour()
	{
		turnRight();
		moveTwo();
		moveTwo();
		turnLeft();
	}



	//Input Methods Methods

	//Input First Digit of Time Here ["number"();]
	public void digitOne()
	{
		one();
	}
	
	//Input Second Digit of Time Here ["number"();]
	public void digitTwo()
	{
		two();
	}
		
	//Input Third Digit of Time Here ["number"();]
	public void digitThree()
	{
		three();
	}
		
	//Input Fourth Digit of Time Here ["number"();]
	public void digitFour()
	{
		nine();
	}
	
	//Adds Method Run Program
	public void runProgram()
	{
		digitOne();
		moveDigitTwo();
		digitTwo();
		moveDigitThree();
		digitThree();
		moveDigitFour();
		digitFour();
		turnOff();
	}
	
	//The Main Method
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Clock");
		World.setVisible();
		World.showSpeedControl(true);
						
		//Creates robot and runs program
		Clockworker clockbot = new Clockworker(1,1,North,9001);
		clockbot.runProgram();
	}
}