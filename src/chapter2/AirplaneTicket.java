//Finds airplane ticket checking #
//12/9/14
package programs;
import java.util.Scanner;

public class AirplaneTicket 
{
	//Declares a variable for the ticket # and the checking #
	int ticketNumber, checkingNumber;
	Scanner scan = new Scanner(System.in);
		
	//ask for ticket #
	public void inputNumber()
	{
		System.out.println("Please Enter your airplane ticket number to generate it's checking number.");
		ticketNumber = scan.nextInt();
		scan.nextLine();
	}
	
	//Finds checking # of ticket #
	public void findCheckNumber()
	{
		checkingNumber = ticketNumber % 7;
	}
	
	//Outputs the checking number to the console
	public void outputCheckNumber()
	{
		System.out.println(checkingNumber);
	}
	
	//Runs Program
	public void runProgram()
	{
		inputNumber();
		findCheckNumber();
		outputCheckNumber();
	}
		
	//Creates object and runs program
	public static void main(String[] args) 
	{
		AirplaneTicket object = new AirplaneTicket();
		object.runProgram();	
	}
}
