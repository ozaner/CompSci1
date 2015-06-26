package test;

public class Security extends CoolRobot 
{
	public Security(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		
	}
	
/**
	
//METHODS FOR VARIATION 1
	//Adds new method turnRight
	public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	//Adds new method moveTen
	public void moveTen()
	{
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		move();
	}
	
	//Adds new method moveWall
	public void moveWall()
	{
		moveTen();
		turnRight();
		putBeeper();
		
	}
	
	//Adds new method movePerimeter
	public void movePerimeter()
	{
		moveWall();
		moveWall();
		moveWall();
		moveWall();
		
	}
	
	//Adds new method runProgram
	public void movePerimeterTen()
	{
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		movePerimeter();
		
	}
	
	//Adds new method runProgram
	public void movePerimeterHundred()
	{
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
		movePerimeterTen();
			
		}
	
//METHODS FOR VARIATION 2
	
	//Adds new method moveSix
		public void moveSix()
		{
			move();
			move();
			move();
			move();
			move();
			move();
			
		}
		
	//Adds new method moveFour
	public void moveFour()
	{
		move();
		move();
		move();
		move();
					
	}
	
	//Adds new method moveWallA
	public void moveWallA()
	{
		move();
		move();
		move();
		move();
						
	}
	**/

	//Security 2.0
	
	//Adds Move Wall
	public void moveWall()
	{
		turnRight();
		while(!frontIsClear())
		{
			turnLeft();
			move();
			turnRight();
		}
		move();
	}
	
	//Adds Move Along Wall Method
		public void moveAlongWall()
		{
			while(true)
			{
				moveWall();
			}
		}
	
	//Adds new method runProgram
	public void runProgram()
	{
		moveAlongWall();
	}
	
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Patrol");
		World.setVisible();
		World.showSpeedControl(true);
		
		//Creates robot and runs program
		Security patrolbot = new Security(5,1,North,400);
		patrolbot.moveAlongWall();
		
	}

}
