package methodConstruction;

import javax.swing.JOptionPane;
public class page134 {

	public static void main(String[] args) 
	{
		String valueCar, vType;
		int value;
		double commRate = 0.08;
		
		computeCommission(40000, 0.10, "L");
		
		vType = JOptionPane.showInputDialog(null, "What is the type of the car?");
		
		valueCar = JOptionPane.showInputDialog(null, "What is is value of the car?");
		value = Integer.parseInt(valueCar);
		computeCommission(value, commRate, vType);
	}

	public static void computeCommission(int value, double rate, String vehicle)
	{
		double commission;
		commission = value * rate;
		JOptionPane.showMessageDialog(null, "\nThe " + vehicle + " type vehicle is worth $" + value);
		JOptionPane.showMessageDialog(null, "With " + (rate * 100) + "% commissionrate, the commission is $" + commission);
	}
}
