package youDoIt;

import java.util.Scanner; //imports the ability to use a scanner class
import java.text.DecimalFormat; //imports the ability to change decimal format
public class DelgadosTacos 
{

	private static Scanner inputDevice; //creates the scanner for use
	public static void main(String[] args) 
	{
		tacoTruck(); //This presents the tacoTruck method
		menu(); //This presents the menu method
	}
	
	public static void menu()
	{
		String burrito, churro, chimichanga, tamales, tacoSalad, fajita, taco, enchiladas, pop, water; //All if the insertable values
		double tacoPrice = 2.99;
		double burritoPrice = 1.99;
		double churroPrice = .99;
		double popPrice = 1.49;
		double tacoSaladPrice = 1.49;
		double chimichangaPrice = 1.49;
		double enchiladasPrice = 5.99;
		double tamalesPrice = 1.99;
		double fajitaPrice = 1.99;
		double waterPrice = 0.25;
		double tacoOrdered;
		double burritoOrdered;
		double churroOrdered;
		double popOrdered;
		double tacoSaladOrdered;
		double chimichangaOrdered;
		double enchiladasOrdered;
		double tamalesOrdered;
		double fajitaOrdered;
		double waterOrdered;
		double totalPrice;
		double totalPriceWithTax;
		
		DecimalFormat df = new DecimalFormat("0.00"); //Changes the decimal format
		
		System.out.println("****************************");
		System.out.println("     Tacos Price - 2.99     ");
		System.out.println("     Burrito Price - 1.99   ");
		System.out.println("     Churro Price - 0.99    ");
		System.out.println("     Pop Price - 1.49       ");
		System.out.println("     Chimichangas - 1.49    ");
		System.out.println("     Enchiladas - 5.99      ");
		System.out.println("     Tamales Price - 1.99   ");
		System.out.println("     Fajitas Price - 1.99   ");
		System.out.println("   Taco Salad Price - 1.99  ");
		System.out.println("     Water Price - 0.25     ");
		System.out.println("****************************");
		
		inputDevice = new Scanner(System.in); //creates the new scanner
		
		System.out.println("How many Tacos do you want? >> ");
		tacoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Burritos do you want? >> ");
		burritoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();		
		
		System.out.println("How many Churros do you want? >> ");
		churroOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many pops do you want? >> ");
		popOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Chimichangas do you want? >> ");
		chimichangaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Enchiladas do you want? >> ");
		enchiladasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Tamales do you want? >> ");
		tamalesOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Fajitas do you want? >> ");
		fajitaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Taco Salads do you want? >> ");
		tacoSaladOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many Waters do you want? >> ");
		waterOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		totalPrice = (tacoPrice * tacoOrdered) + (burritoPrice * burritoOrdered) + (churroPrice * churroOrdered) + 
				(popPrice * popOrdered) + (chimichangaPrice * chimichangaOrdered) + (enchiladasPrice * enchiladasOrdered) + 
				(tamalesPrice * tamalesOrdered) + (fajitaPrice * fajitaOrdered) + (tacoSaladPrice * tacoSaladPrice) + (waterPrice * waterOrdered);
		
		System.out.println("You ordered " + tacoOrdered + " tacos, " + burritoOrdered + " burritos, " + 
				churroOrdered + " \nchurros, " + chimichangaOrdered + " chimichangas, " + 
				enchiladasOrdered + " enchiladas, " + tamalesOrdered + " \ntamales, " + fajitaOrdered + " fajitas, "
				+ tacoSaladOrdered + " Taco Salads, " + "\n" + waterOrdered + " waters " +  popOrdered + " pops, for a total of $" + (df.format(totalPrice)));
		
		totalPriceWithTax = totalPrice * 1.075;
		
		System.out.println("*************************************************");
		System.out.println("Your Total with tax comes to $" + (df.format(totalPriceWithTax)));
		System.out.println("*************************************************");
		
	}
	
	public static void salesTax()
	{
		double salesTax = .075;
	}
	
	public static void tacoTruck()
	{
		System.out.println(" *******************************");
		System.out.println(" *  *****   *    **** ****     *");
		System.out.println(" *    *    * * 	 *    *  *     *");
		System.out.println(" *    *	  *****	 *    *	 *     *");
		System.out.println(" *    *	 *     * **** ****     *");
		System.out.println(" *******************************");
		System.out.println("       *               *        ");
		System.out.println("*********************************");
		System.out.println("*       Jim's Amazing Tacos     ****");
		System.out.println("*       *******************	       ***");
		System.out.println("*       *                 *	  ****   **");
		System.out.println("*       *   O   O   O     *	  *	  *  **");
		System.out.println("*       *  -|- -|- -|-    *   *****	  *******");
		System.out.println("*       *******************	                ***");
		System.out.println("*                       	                  **");
		System.out.println("*       Worlds Best Tacos                      **");
		System.out.println("*     *****                         *****     **");
		System.out.println("******     *************************     ******");
		System.out.println("     *     *                       *     *");
		System.out.println("      *****                         *****");
	}
}
