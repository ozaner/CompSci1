//Ozaner Hansha
//Intro to Comp. Sci 1 - Period 4
//9/16/2014
//Newspaper
//Robot will pick up "newspaper" (beeper) and return to starting location


package test;

public class NewspaperHansha 
implements Directions{
	

	public static void main(String[] args) 
	{
		//World Modifiers
		World.readWorld("Newspaper");
		World.setVisible();	
		World.showSpeedControl(true);
		//Create Robot
		UrRobot paperbot = new UrRobot(3,4,West,0);			
		//Directions to get Paper (Now at (3,4))
		paperbot.turnLeft();
		paperbot.turnLeft();
		paperbot.turnLeft();
		paperbot.move();
		paperbot.move();
		paperbot.turnLeft();
		paperbot.move();
		paperbot.move();
		paperbot.turnLeft();
		paperbot.move();
		paperbot.move();
		paperbot.turnLeft();
		paperbot.move();
		paperbot.pickBeeper();		
		//Directions to get back (Now at (3,3))
		paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.move();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.move();
			paperbot.move();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.move();
			paperbot.move();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.move();
			paperbot.move();
			paperbot.turnLeft();
			paperbot.turnLeft();
			paperbot.turnLeft();		
			paperbot.turnOff();	
	}
}
