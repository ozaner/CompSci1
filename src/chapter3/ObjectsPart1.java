//Objects Part 1
//12/17/14
package programs;
import java.util.Scanner;
public class ObjectsPart1
{	
	Scanner scan = new Scanner(System.in);
	
	public void twinkle()
	{
		String twinkle = "twinkle, twinkle little star", replaceTC, replaceWR;
		System.out.println(twinkle);
		
		replaceTC = twinkle.replace('t', 'c');
		replaceWR = replaceTC.replace('w', 'r');
		System.out.println(replaceWR);
	}
	
	public void name()
	{
		String FirstName,LastName, firstName3Letters, lastName3Letters, concatNames, uppercase;
		
		System.out.println("Please enter your First Name");
		FirstName = scan.nextLine();
		
		System.out.println("Please enter your Last Name");
		LastName = scan.nextLine();
		
		firstName3Letters = FirstName.substring(0, 3);
		lastName3Letters = LastName.substring(0, 3);
		
		concatNames = firstName3Letters.concat(lastName3Letters);
		uppercase = concatNames.toUpperCase();
		System.out.println("This is your password " + uppercase);
	}
	
	public void sentence()
	{
		String sentence;
		int length, indexNumber;
		char index;
		
		System.out.println("Please enter a sentence");
		sentence = scan.nextLine();
		
		length = sentence.length();
		System.out.println("That sentence is " + length + " characters long.");
		
		System.out.println("Please enter a number smaller than the length to find its corrisponding character in the sentence.");
		indexNumber = scan.nextInt();
		
		index = sentence.charAt(indexNumber);
		System.out.println("The character that corrisponds with that number is " + index);
	}
	
	public void pigLatin()
	{
		String word, pigWord, stringLetter;
		final String ending = "ay";
		char firstLetter;
		
		System.out.println("Please enter a word to be converted into Pig Latin");
		word = scan.nextLine();
		
		firstLetter = word.charAt(0);
		pigWord = word.substring(1);
		stringLetter = Character.toString(firstLetter);
		pigWord = pigWord.concat(stringLetter);
		pigWord = pigWord.concat(ending);
		System.out.println("the PigLatin version of that word is " + pigWord);
	}
	
	public static void main(String[] args)
	{
		ObjectsPart1 obj = new ObjectsPart1();
		obj.pigLatin();
	}
}
