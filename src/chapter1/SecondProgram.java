package test;

public class SecondProgram 
implements Directions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	//World Modifiers
	World.readWorld("World1");
	World.setVisible();
		
	//Create Robot
	UrRobot billy = new UrRobot(1,1,North,1);
		
	//Directions
	billy.move();
	billy.turnLeft();
	billy.turnLeft();
	billy.turnLeft();
	billy.move();
	billy.move();
	billy.putBeeper();
	billy.move();
	billy.turnOff();
	}

}
