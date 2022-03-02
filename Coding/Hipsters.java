import java.util.Scanner;

public class Hipsters {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in); 
		//customer order details - distance & record costs are floats to account for cents
		System.out.println("Hipster's Local Vinyl Records - Customer Order Details");
		System.out.println();
		
		System.out.print("Enter the customer's name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter the distance in kilometers for delivery: ");
		float delivery = scan.nextFloat();
		
		System.out.print("Enter the cost of records purchased: ");
		float records = scan.nextFloat();
		System.out.println();
		
		//math needed to calculate delivery fee of $15/km and tax of 14%
		float deliverycost = delivery * 15;
		double recordcost = records * 1.14;
		double total = deliverycost + recordcost;

		System.out.println("Purchase summary for " + name + "");
		
		System.out.printf("Delivery Cost: $ %.2f", deliverycost);//%.2f formats to 2 decimal places
		System.out.println();//these lines are to format the output
		
		System.out.printf("Purchase Cost: $ %.2f", recordcost);
		System.out.println();
		
		System.out.printf("Total Cost   : $ %.2f", total);
		System.out.println();
	}
}
		
