//Ozaner Hansha
//Intro to Comp. Sci 1 - Period 4
//10/1/2014
//Diamond Harvester (20Pts.)

package test;

public class DiamondHarvest extends UrRobot
{
	public DiamondHarvest(int street, int avenue, Direction direction, int beepers) 
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
	
	//Adds Method Pick Diagonal North-East
	public void pickDiagonalNE()
	{
		pickBeeper();
		move();
		turnRight();
		move();
		turnLeft();
	}
	
	//Adds Method Turn Right
	public void pickDiagonalSW()
	{
		pickBeeper();
		move();
		turnLeft();
		move();
		turnRight();
	}
	
	//Adds Method Turn Right
	public void nextRowE()
	{
		pickBeeper();
		move();
		turnLeft();
		move();
	}
		
	//Adds Method Turn Right
	public void nextRowW()
	{
		pickBeeper();
		move();
		turnRight();
		move();
	}
	
	//Adds Method Turn Right
	public void pickRowNE()
	{
		pickDiagonalNE();
		pickDiagonalNE();
		pickDiagonalNE();
		nextRowE();
	}
	
	//Adds Method Turn Right
	public void pickRowSW()
	{
		pickDiagonalSW();
		pickDiagonalSW();
		pickDiagonalSW();
		nextRowW();
	}
	
	//Adds Method Turn Right
	public void pickTwoRows()
	{
		pickRowNE();
		pickRowSW();
		pickRowNE();
		pickRowSW();
	}
	
	//Adds Method Turn Right
	public void runProgram()
	{
		move();
		pickTwoRows();
		turnOff();
	}
	
	//The Main
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("DiamondHarvest");
		World.setVisible();
		World.showSpeedControl(true);
					
		//Creates robot and runs program
		DiamondHarvest harvestbot = new DiamondHarvest(1,6,North,0);
		harvestbot.runProgram();
	}
}
