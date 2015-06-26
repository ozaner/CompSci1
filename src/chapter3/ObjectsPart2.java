//Part 2 of 3.1-3.2 Lab
//1/20/15
package programs;
import java.util.Scanner;

public class ObjectsPart2
{
	//declares variables and objects
	Scanner scan = new Scanner(System.in);
	final String name = "MINECRAFT";
	String nameGuess, letterGuess;
	int nameLength, letterIndex, nameIndex;
	
	//find length of name to output to user
	public void findNameLength()
	{
		nameLength = name.length();
	}
	
	//Returns yes or no and index of character of an inputed letter
	public void guessLetter()
	{
		System.out.println("Guess a letter?");
		letterGuess = scan.nextLine();
		letterGuess = letterGuess.toUpperCase();
		
		letterIndex = name.indexOf(letterGuess);
		if (letterIndex < 0)
		{
			System.out.println(letterGuess + " is not in the name.");
		}
		else
		{
			System.out.println(letterGuess + " is in the name. It is in position " + (letterIndex + 1) + ".");
		}
	}
	
	//Returns yes or no if name was guessed
	public void guessName()
	{
		System.out.println("Now what student do you think it is?");
		System.out.println("Type in the name and I will tell you if you're right.");
		nameGuess = scan.nextLine();
		nameGuess = nameGuess.toUpperCase();
		
		nameIndex = nameGuess.indexOf(name);
		if (nameIndex < 0)
		{
			System.out.println("Wrong. I was thinking of " + name + ".");
		}
		else
		{
			System.out.println("Correct. Nice Job!");
		}
	}
	
	//Runs Program
	public void runProgram()
	{
		System.out.println("I am thinking of the name of a student in this class.");
		System.out.println("I will let you pick three letters and I will tell you the first location that they occur in the name.");
		System.out.println("Once we have finished that, I will give you the opportunity to guess the name.");
		
		findNameLength();
		System.out.println("The name is " + nameLength + " letters long.");
		
		guessLetter();
		guessLetter();
		guessLetter();
		guessName();
	}
	
	public static void main(String[] args)
	{
		ObjectsPart2 obj = new ObjectsPart2();
		obj.runProgram();
	}
}
