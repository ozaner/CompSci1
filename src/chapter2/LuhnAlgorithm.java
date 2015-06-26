//Uses the Luhn algorithm to check credit card numbers.
//12/5/14
package programs;
import java.util.Scanner;

public class LuhnAlgorithm {

	//Declares a variable for each digit
	int d2, d2_1, d2_2, d3, d4, d4_1, d4_2, d5, d6, d6_1, d6_2, d7, d8, d8_1, d8_2, 
	d9, d10, d10_1, d10_2, d11, d12, d12_1, d12_2, d13, d14, d14_1, d14_2, d15, d16, d16_1,
	d16_2, sumDigit, test0, checkingNumber;
	
	long ticketNumber;

	Scanner scan = new Scanner(System.in);
	
	//Asks user for credit card number
	public void inputTicketNumber()
	{
		System.out.println("Please enter your credit card number to generate its checking number.");
		ticketNumber = scan.nextLong();
		scan.nextLine();
	}
	
	//splits digits of ticket number into seperate ints
	public void splitDigits()
	{
		d2 = (int) (ticketNumber % 10);
		d3 = (int) (ticketNumber / 10 % 10);
		d4 = (int) (ticketNumber / 100 % 10);
		d5 = (int) (ticketNumber / 1000 % 10);
		d6 = (int) (ticketNumber / 10000 % 10);
		d7 = (int) (ticketNumber / 100000 % 10);
		d8 = (int) (ticketNumber / 1000000 % 10);
		d9 = (int) (ticketNumber / 10000000 % 10);
		d10 = (int) (ticketNumber / 100000000 % 10);
		d11 = (int) (ticketNumber / 1000000000 % 10);
		d12 = (int) (ticketNumber / 1000000000 / 10 % 10);
		d13 = (int) (ticketNumber / 1000000000 / 100 % 10);
		d14 = (int) (ticketNumber / 1000000000 / 1000 % 10);
		d15 = (int) (ticketNumber / 1000000000 / 10000 % 10);
		d16 = (int) (ticketNumber / 1000000000 / 100000 % 10);
	}
	
	//Calculates checking number
	public void calculateCheckingNumber()
	{
		//doubles every second digit
		d2 = d2 * 2;
		d4 = d4 * 2;
		d6 = d6 * 2;
		d8 = d8 * 2;
		d10 = d10 * 2;
		d12 = d12 * 2;
		d14 = d14 * 2;
		d16 = d16 * 2;
		
		//Checks if digits are bigger than 9 and adds them if needed
		if (d2 > 9)
		{
			d2_2 = d2 % 10;
			d2_1 = d2 / 10 % 10;
			
			d2 = d2_1 + d2_2;
		}
		
		if (d4 > 9)
		{
			d4_2 = d4 % 10;
			d4_1 = d4 / 10 % 10;
			
			d4 = d4_1 + d4_2;
		}
		
		if (d6 > 9)
		{
			d6_2 = d6 % 10;
			d6_1 = d6 / 10 % 10;
			
			d6 = d6_1 + d6_2;
		}
		
		if (d8 > 9)
		{
			d8_2 = d8 % 10;
			d8_1 = d8 / 10 % 10;
			
			d8 = d8_1 + d8_2;
		}
		
		if (d10 > 9)
		{
			d10_2 = d10 % 10;
			d10_1 = d10 / 10 % 10;
			
			d10 = d10_1 + d10_2;

		}
		
		if (d12 > 9)
		{
			d12_2 = d12 % 10;
			d12_1 = d12 / 10 % 10;
			
			d12 = d12_1 + d12_2;
		}
		
		if (d14 > 9)
		{
			d14_2 = d14 % 10;
			d14_1 = d14 / 10 % 10;
			
			d14 = d14_1 + d14_2;
		}
		
		if (d16 > 9)
		{
			d16_2 = d16 % 10;
			d16_1 = d16 / 10 % 10;
			
			d16 = d16_1 + d16_2;
		}
		
		//Adds digits together then multiplies by 9
		sumDigit = d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
		
		//checks if last digit of sum is 0 and calculates accordingly
		test0 = sumDigit % 10;
			
		if (test0 > 0)
		{
			checkingNumber = 10 - test0;
		}
		else
		{
			checkingNumber = 0;
		} 
	}
		
	//Outputs checking number to console
	public void outputCheckingNumber()
	{
		System.out.println("The checking digit of your credit card is " + checkingNumber);
	}
	
	//Runs Program
	public void runProgram()
	{
		inputTicketNumber();
		splitDigits();
		calculateCheckingNumber();
		outputCheckingNumber();
	}
	
	//Creates object and runs program
	public static void main(String[] args) 
	{
		LuhnAlgorithm object2 = new LuhnAlgorithm();
		object2.runProgram();
	}
}
