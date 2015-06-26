package programs;
import java.util.Scanner;

public class PercentageOff
{
	//Variable declarations + scanner creation
	double percent, price, newPrice;
		
	Scanner scan = new Scanner(System.in);
	
	//asks for percent off and original price
	public void askForInput()
	{
		System.out.println("enter percent off");
		percent = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("enter price");
		price = scan.nextDouble();
		scan.nextLine();
	}
	
	//calculates final price
	public void calculate()
	{
		newPrice = (1 - percent) * price;
	}
	
	///outputs final price
	public void output()
	{
		System.out.println(newPrice);
	}
	
	//Runs Program
	public void runProgram()
	{
		askForInput();
		calculate();
		output();
	}
	
	//creates object and runs program
	public static void main(String[] args) 
	{
		PercentageOff object = new PercentageOff();
		object.runProgram();
	}
}
