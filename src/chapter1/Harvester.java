package test;

public class Harvester extends UrRobot
{

	public Harvester(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);
		
	}

	//New Harvester Methods
	
	//Adds Turn Right Method
	public void turnRight()
	
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	//Adds Harvest Method
	public void harvest()
		
	{
		move();
		pickBeeper();
	}
	
	//Adds HarvestRow Method
	public void harvestRow()
			
	{
		harvest();
		harvest();
		harvest();
		harvest();
		harvest();
		harvest();
		harvest();
	}
	
	//Adds HarvestSix Method
		public void harvestSix()
				
	{
		harvest();
		harvest();
		harvest();
		harvest();
		harvest();
		harvest();
	}
	
	//Adds Left Side U-Turn Method
	public void leftSideUTurn()
			
	{
		turnRight();
		move();
		pickBeeper();
		turnRight();
	}
	
	//Adds Right Side U-Turn Method
	public void rightSideUTurn()
			
	{
		turnLeft();
		move();
		pickBeeper();
		turnLeft();
	}	
	
	//Adds Harvest 2 Rows Method
	public void harvestTwoRows()
				
	{
		harvestSix();
		rightSideUTurn();
		harvestSix();
		leftSideUTurn();
	}
	
	//Adds Harvest 2 Rows Method
		public void runProgram()
					
	{
		harvest();
		harvestTwoRows();
		harvestTwoRows();
		harvestTwoRows();
		turnOff();
	}
	
	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Harvest");
		World.setVisible();
		World.showSpeedControl(true);
		
		//Creates robot and runs program
		Harvester harvestbot = new Harvester(2,2,East,0);
		harvestbot.runProgram();
		
	}
	
}
