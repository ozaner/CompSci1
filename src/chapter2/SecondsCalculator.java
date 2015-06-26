//Converts seconds to hours, minutes & seconds.
//12/17/14
package programs;
import java.util.Scanner;

public class SecondsCalculator 
{
	//Variable declarations + scanner creation
	int input, hours, minutes, seconds, remainder;
	
	Scanner scan = new Scanner(System.in);
	
	//Asks user for amount of seconds
	public void askForInput()
	{
		System.out.println("Please enter the amount of seconds to be converted.");
		input = scan.nextInt();
		scan.nextLine();
	}
	
	//Converts seconds to h:m:s
	public void convert()
	{
		hours = input / 3600;
		
		remainder = input - (hours * 3600);
		minutes = remainder / 60;
		
		remainder = remainder - (minutes * 60);
		seconds = remainder;
	}
	
	//outputs h:m:s format to console
	public void outputToConsole()
	{
		System.out.println(input + " seconds in hour:minute:second format is " + hours + ":" + minutes + ":" + seconds);
	}
	
	//Runs Program
	public void runProgram()
	{
		askForInput();
		convert();
		outputToConsole();
	}
	
	public static void main(String[] args) 
	{
		SecondsCalculator object = new SecondsCalculator();
		object.runProgram();
	}

}
