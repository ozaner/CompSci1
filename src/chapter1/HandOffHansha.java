package test;

public class HandOffHansha implements Directions
{
	

	public static void main(String[] args) {
	//World Modifiers
	World.setVisible();
	World.showSpeedControl(true);
	
	//Create Robots
			UrRobot karel = new UrRobot(1,1,North,1);
			UrRobot carl = new UrRobot(1,4,East,2);
			
		//This section makes karel place beeper on same corner as carl. Ends at (1,4)
			karel.turnLeft();
			karel.turnLeft();
			karel.turnLeft();
			karel.move();
			karel.move();
			karel.move();
			karel.putBeeper();
			
		//This section makes carl pick beeper and move it to correct place. Ends at (3,4)
			
			carl.pickBeeper();
			carl.turnLeft();
			carl.move();
			carl.move();
			carl.putBeeper();
			
		//This section returns carl to his orignal position. Ends at (1,4)
			carl.turnLeft();
			carl.turnLeft();
			carl.move();
			carl.move();
			carl.turnLeft();
			carl.turnOff();
			
		//This section returns karel to orignal position. Ends at (1,1)
			karel.turnLeft();
			karel.turnLeft();
			karel.move();
			karel.move();
			karel.move();
			karel.turnLeft();
			karel.turnLeft();
			karel.turnLeft();
			karel.turnOff();
			
		}
}