//This Program find the averages of 3 numbers
//11/20/14
package programs;
import java.util.Scanner;

public class ScannerPractice 
{
	//Declares Variables
	String name, className;
	int quiz1, quiz2, quiz3;
	double average;
	Scanner scan = new Scanner(System.in);

	//Gets name, class, and 3 quiz grades from user
	public void getUserInput()
	{
		System.out.println("Enter your name.");
		name = scan.nextLine();
		
		System.out.println("Hello " + name +", please enter the name of your class");
		className = scan.nextLine();
		
		System.out.println("Please enter your 1st quiz Grade.");
		quiz1 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please enter your 2nd quiz Grade.");
		quiz2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Please enter your 3rd quiz Grade.");
		quiz3 = scan.nextInt();
		scan.nextLine();
		
	}
	
	//Finds average of 2 quizes
	public void findAverage()
	{
		average = (quiz1 + quiz2 + quiz3)/3;
	}
	
	public void outputAverage()
	{
		System.out.println(average);
	}
	
	//Runs Program
	public void runProgram()
	{
		getUserInput();
		findAverage();
		outputAverage();
	}
	
	//Creates object and runs program
	public static void main(String[] args) 
	{
		ScannerPractice object = new ScannerPractice();
		object.runProgram();
	}

}
