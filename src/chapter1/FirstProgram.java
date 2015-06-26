package test;

public class FirstProgram
implements Directions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		World.setVisible();
		
	//Creates Robots	
		UrRobot batbot = new UrRobot(3,1,East,10);
		UrRobot billnye = new UrRobot(8,1,South,99);
		
	//billnye Robot Directions
		billnye.putBeeper();
		billnye.move();
		billnye.putBeeper();
		billnye.move();
		billnye.putBeeper();
		billnye.move();
		billnye.putBeeper();
		billnye.move();
		
	//batbot Robot Directions
		batbot.move();
		batbot.move();
		batbot.move();
		batbot.turnLeft();
	}

}
