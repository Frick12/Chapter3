package exercisesPage175;

public class fiveB 
{

	public static void main(String[] args) 
	{
		double numOne = 2;
		double numTwo = 5;
		double percentage;
		
		percentage = computePercent(numOne, numTwo);
		
		System.out.println("The percentage is " + percentage + " percent.");
	}
	
	public static double computePercent(double numOne, double numTwo)
	{
		double percentage;
		percentage = (numOne / numTwo) * 100 ;
		return percentage;
	}
}
