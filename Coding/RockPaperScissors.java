//This code generates Rock-Paper-Scissors randomly as an opponent to
//play against.
public class RockPaperScissors {
	public static void main (String []args) {
		int min = 1;
		int max = 9;
	
		System.out.println("Rock, Paper, Scissors, shoot!");
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		//System.out.println(random_int);
		
		if (random_int <= 3) {
			System.out.println("Rock"); 
			
		} else if (random_int < 7 ) {
			System.out.println("Paper");
			
		} else { 
			System.out.println("Scissors");
		}
	}
}