package programs;
import java.util.Scanner;

public class RoomPaintCalculator
{
	//variable deceleration and scanner creation
	final int COVERAGE = 350; //paint covers 350sq. feet
	int length, width, height;
	double lateralArea, paintNeeded, paintRatio;

	Scanner scan = new Scanner(System.in);
	
	//Asks for length, width and height.
	public void input()
	{
		System.out.println("Enter length of room.");
		length = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter height of room.");
		height = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter width of room.");
		width = scan.nextInt();
		scan.nextLine();
	}
	
	//calculates and prints to console
	public void calculations()
	{
		lateralArea = 2 * (length + width) * height;
		
		paintRatio = 1.0 / COVERAGE;
		paintNeeded = lateralArea * paintRatio;
	}

	//outputs info to console
	public void output()
	{
		System.out.println("For a " + length + "x" + width + "x" + height + " room, " + paintNeeded + " gallons of paint are needed.");
	}

	//Runs program
	public void runProgram()
	{
		input();
		calculations();
		output();
	}
	
	//creates object and runs program
	public static void main (String[] args)
	{
		RoomPaintCalculator object = new RoomPaintCalculator();
		object.runProgram();
	}
}