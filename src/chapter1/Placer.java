//Ozaner Hansha
//Intro to Comp. Sci 1 - Period 4
//10/1/2014
//Carpet Layer (10pts.)

package test;

public class Placer extends UrRobot
{
	public Placer(int street, int avenue, Direction direction, int beepers) 
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
	
	//Adds Method Put Beeper Then Move
	public void putBeeperMove()
	{
		putBeeper();
		move();
	}
	
	//Adds Method Place Wall
	public void placeWall()
	{
		putBeeperMove();
		putBeeperMove();
		putBeeperMove();
		putBeeperMove();
		putBeeperMove();
		putBeeperMove();
		putBeeperMove();
		turnLeft();
	}
	
	//Adds Method Perimeter
	public void perimeter()
	{
		placeWall();
		placeWall();
		placeWall();
		placeWall();
		turnOff();
	}
	
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Placer");
		World.setVisible();
		World.showSpeedControl(true);
				
		//Creates robot and runs program
		Placer placerbot = new Placer(9,2,South,28);
		placerbot.perimeter();
	}

}
