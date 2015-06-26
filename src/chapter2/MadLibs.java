//This Program plays a game of Madlibs with the user.
//11/21/14
package programs;
import java.util.Scanner;

public class MadLibs
{
	//Declare Variables
	int age, date, carPrice;
	String name, place, item, month, car;
	char character;
	double itemPrice;
	Scanner scan = new Scanner(System.in);
	
	//Asks the user for the words and numbers
	public void askForVariables()
	{
		//Welcome Message
		System.out.println("Welcome to MadLibs©");
		
		//User input: Age
		System.out.println("Please enter an Age. Ex. 27");
		age = scan.nextInt();
		scan.nextLine();
		
		//User input: date
		System.out.println("Please enter a date. Ex. 31");
		date = scan.nextInt();
		scan.nextLine();
		
		//User input: car
		System.out.println("Please enter the name of a Car. Ex. Prius");
		car = scan.nextLine();
		
		//User input: name
		System.out.println("Please enter a name. Ex. Billy");
		name = scan.nextLine();
		
		//User input: place
		System.out.println("Please enter a place. Ex. Supermarket");
		place = scan.nextLine();
		
		//User input: item
		System.out.println("Please enter an item. Ex. Milk");
		item = scan.nextLine();
		
		//User input: month
		System.out.println("Please enter a month. Ex. February");
		month = scan.nextLine();
		
		//User input: carPrice
		System.out.println("Please enter a price in USD. Ex. 3000");
		carPrice = scan.nextInt();
		scan.nextLine();
		
		//User input: character
		System.out.println("Please enter any character. Ex. %");
		character = scan.nextLine().charAt(0);
		
		//User input: itemPrice
		System.out.println("Please enter a price in USD. Ex. 3.99");
		itemPrice = scan.nextDouble();
		scan.nextLine();
	}
	
	//Prints the completed MadLib to the console
	public void tellStory()
	{
		System.out.println("Here is the MadLib");
		System.out.println();
		
		System.out.println("Once upon a time, there was a " + age + " year-old boy named " + name + ".");
		System.out.println(name + " 's favorite charcter to type on a keyboard was " + character + ".");
		System.out.println(name + " went to a " + place + " on " + month + " " + date + ".");
		System.out.println("At the " + place + " " + name + " bought a " + item + " that cost $" + itemPrice + ".");
		System.out.println("After " + name + " bought a " + item + ", " + name + " jacked a $" + carPrice + " " + car);
	}
	
	//Runs Program
	public void runProgram()
	{
		askForVariables();
		tellStory();
	}
	
	//Creates object and runs program
	public static void main(String[] args) 
	{
		MadLibs object = new MadLibs();
		object.runProgram();
	}
}
