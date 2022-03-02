import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ImperialMetric {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat dfgram = new DecimalFormat("0.0");//Defines desired decimal format for grams
		DecimalFormat df = new DecimalFormat("0");//Defines desired decimal format for metric ton & kilograms
		
		System.out.println("Imperial To Metric Conversion");
		System.out.println();
		
		//Inputs for imperial units
		System.out.print("Enter the number of tons: ");
		float tons = scan.nextFloat();
		
		System.out.print("Enter the number of stones: ");
		float stones = scan.nextFloat();
		
		System.out.print("Enter the number of pounds: ");
		float pounds = scan.nextFloat();
		
		System.out.print("Enter the number of ounces: ");
		float ounces = scan.nextFloat();
		System.out.println();
		
		//Metric conversion calculations
		double oz = (35840 * tons) + (224 * stones) + (16 * pounds) + ounces;
		double kilos = (oz / 35.274);
		double mt = (kilos / 1000);
		double grams = (kilos * 1000);
		
		//Isolating calculations
		double gram = grams % 1000;//Created a new line for if code is expanded upon
		double kilo = kilos % 1000;//Isolating in a different line to not affect the metric ton calculations
		
		df.setRoundingMode(RoundingMode.DOWN);//Sets the rounding down
		System.out.printf("The metric weight is " + df.format(mt) + " metric tons, " + df.format(kilo) + " kilos, and " + dfgram.format(gram) + " grams");
	}
}