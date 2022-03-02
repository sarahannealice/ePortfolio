import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LoanCalculator {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");//Defines the desired decimal format
		
		//Inputs
		System.out.println("Weekly Loan Calculator");
		System.out.println();
		
		System.out.print("Enter the amount of loan: ");
		float loan = scan.nextFloat();//Set as float in case they were loaned cents
		
		System.out.print("Enter the interest rate (%): ");
		float interest = scan.nextFloat();
		
		System.out.print("Enter the number of years to pay off the loan: ");
		float years = scan.nextFloat();//Float as I'm unsure if you can pay loan off in partial years
		System.out.println();
		
		//Calculations for weekly payment
		float i = interest/5200;
		double payment = (i / (1 - Math.pow((1 + i),(-52 * years)))) * loan;
		
		df.setRoundingMode(RoundingMode.UP);//DecimalFormat utility to format decimals - rounds decimals up.
		System.out.printf("Your weekly payment will be: $" + df.format(payment));
	}
}
	
	