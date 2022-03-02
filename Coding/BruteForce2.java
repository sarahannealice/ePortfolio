public class BruteForce2 {
	public static void main(String[] args) {
		//markable version
		
		System.out.println();
		System.out.println("Mini-Assignment will calculate the following equation for you: ABCDE x A = EEEEEE");
		System.out.println();
		
		//defining initial variables
		int Ee = 111111;
		int e = Ee % 10;
		int a = 1;
		
		//for loop to check all potential answers
		for (Ee = 111111; Ee <= 999999; Ee = Ee += 111111) {
			int ee = Ee % 10;
			
			//for loop to check all potential A values
			for (a = 1; a <= 9; a++) {
				int ans = Ee / a;
				
				//while loop to separate digits of all answers
				while (ans > 0) {
					int A = ans / 10000 % 10;
					int B = ans / 1000 % 10;
					int C = ans / 100 % 10;
					int D = ans / 10 % 10;
					int E = ans %10;
					
					//if statement to confirm if E in Ee (answer) equals E in ABCDE
					if (E == ee) {
						
						//if statement to confirm unique digits
						if (A != B && A != C && A != D && A != E && B != C && B != D && B != E && C != D && C != E && D != E) {
							System.out.println("When E (EEEEEE) equals " + ee);
							
							System.out.println(" A equals " + a);
							System.out.println(" = " + ans);
							
							System.out.println("The diviser has unique digits");
							System.out.println(" and it is TRUE!! :)");
							
							String answer = " " + ans + " x " + a + " = " + Ee + "";
							System.out.println("The answer to the above equation is:" + answer);
							System.out.println();
						
						} else {
						
						}
						
					} else {
						
					}
					
					break;
				}
			}
		}
	}
}