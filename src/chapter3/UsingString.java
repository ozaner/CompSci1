//Using the String object
//12/17/14
package programs;
import java.util.Scanner;
public class UsingString 
{
	String longWay = new String("long way to create a string");
	String shortWay = "short way to";
	
	Scanner scan = new Scanner(System.in);
	
	String mutation1, mutation2, mutation3, mutation4;
	char oldChar, newChar;
	
	public void runMutations()
	{
		System.out.println("The orignal string is: " + shortWay);
		
		mutation1 = shortWay.concat(" create a string");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', '!');
		mutation4 = mutation3.substring(3, 10);
		
		System.out.println("Mutation 1 is: " + mutation1);
		System.out.println("Mutation 2 is: " + mutation2);
		System.out.println("Mutation 3 is: " + mutation3);
		System.out.println("Mutation 4 is: " + mutation4);
	}
	
	public static void main(String[] args)
	{
		UsingString bob = new UsingString();
		bob.runMutations();
	}
}
