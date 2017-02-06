package exercisesPage175;

import java.util.Scanner;
public class fourB 
{

	public static void main(String[] args) 
	{
		int numOne;
		
		int numDouble;
		int numPlusFive;
		int numSquared;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number >> ");
		numOne = keyboard.nextInt();
		
	//	System.out.print("Enter your second number >> ");
	//	numTwo = keyboard.nextInt();
		
		numDouble = displayTwiceNumber(numOne);
		numPlusFive = displayNumberPlusFive(numOne);
		numSquared = displayNumberSquared(numOne);
		
		System.out.println("Your number doubled is " + numDouble);
		System.out.println("Your number plus 5 is " + numPlusFive);
		System.out.println("Your number squared is " + numSquared);
	}
	
	public static int displayTwiceNumber(int num)
	{
		int numDouble;
		numDouble = num * 2;
		return numDouble;
	}

	public static int displayNumberPlusFive(int num)
	{
		int numPlusFive;
		numPlusFive = num + 5;
		return numPlusFive;
	}
	
	public static int displayNumberSquared(int num)
	{
		int numSquared;
		numSquared = num * num;
		return numSquared;
	}
}
