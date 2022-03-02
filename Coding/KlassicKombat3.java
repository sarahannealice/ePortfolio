import java.util.Scanner;

public class KlassicKombat3 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		//GAME START
        System.out.println("New Game. Yes/No?");
		String yesno = scan.nextLine();
		//GAME END
        if (yesno.toLowerCase().equals("no")) {
            System.out.println("The journey will be here when you are ready. Don't take too long, we are waiting.");
        
        } else if (yesno.toLowerCase().equals("yes")) {
            System.out.println("In a small village, there has been conflicts between the local mob and civilians taking place.");
            System.out.println("Choose a side, Good/Bad.");
            String goodbad = scan.nextLine();
            //LOOPS IF BAD IS CHOSEN, PROMPTS TO CHOOSE GOOD. GOES TO ELSE IF NEITHER GOOD/BAD IS CHOSEN
            while (goodbad.toLowerCase().equals("bad")) {
                System.out.println("Rethink your choice... Choose a side, Good/Bad?");
                goodbad = scan.nextLine();
                if (goodbad.toLowerCase().equals("good")) {
                    break;
                }               
            }//CHARACTER SELECTION
             if (goodbad.toLowerCase().equals("good")) {
                System.out.println("Please Select a fighter: Sumo or Ninja");
                String fighter = scan.nextLine();
				//NINJA SELECTION
                if (fighter.toLowerCase().equals("ninja")) {
                    System.out.println("You have chosen the deadly shadow herself, Tai Li");

                    scan.nextLine();
                    System.out.println("You set off towards the mob's hideout to make things right when you come to a fork in the road."); 

                    System.out.println("To the Left is a dark, wet road with trees overhanging above.");
        
                    System.out.println("To the right appears to be sunny but you notice an odd toad in the middle of the road. Which way do you go?"); 
                    String lr = scan.nextLine();
					//LOOPS UNTIL LEFT/RIGHT IS CHOSEN
                    while (true) {
                        System.out.println("You ponder it. Which way do you go?");
                        lr = scan.nextLine();
                        if (lr.toLowerCase().equals("left") || lr.toLowerCase().equals("right")) {
                            break;
                        }               
                    }//GAME END
                    if (lr.toLowerCase().equals("left")) {
                        System.out.println("While walking down the dark road you are unable to see the cliff infront of you.");
                        
                        scan.nextLine();
                        System.out.println("A branch falls, pushing you near the cliff edge... almost but not quite... off the cliff");

                        scan.nextLine();
                        System.out.println("*arms out, steadying yourself*");
                        
                        scan.nextLine();
                        System.out.println("This is not what you signed up for. You turn around and think about your next training session.");
                        System.exit(0);
						
                    } else if (lr.toLowerCase().equals("right")) {
                        System.out.println("As you get closer to the frog, it ribbits while starring at you and hops away.");
                        System.out.println("Not far ahead you see Myles, the evil mob boss.");
                        System.out.println("Will you fight? Yes/No");
                        String ny = scan.nextLine();
						//GAME END
                        if (ny.toLowerCase().equals("no")) {
                            System.out.println("You notice you are outnumbered. Today is not the day to fight.");
                            System.exit(0);
						//GAME END - WIN
                        } else if (ny.toLowerCase().equals("yes")) {
                            scan.nextLine();
                            System.out.println("Myles throws a knife at you. You throw your kunai and it hits, redirecting the knife away from you.");

                            scan.nextLine();
                            System.out.println("You throw a shuriken at a tree a few inches from him. He realizes you're too good and backs off.");

                            scan.nextLine();
                            System.out.println("CONGRATULATIONS! You beat Myles, the mob boss.");

                            scan.nextLine();
                            System.out.println("The local mob stop terrorizing the village thanks to your heroic actions.");
                            System.exit(0);
                        }
                    }//SUMO SELECTION
                } else if (fighter.toLowerCase().equals("sumo")) {
                    System.out.println("You have chosen the strongest and most nimble sumo, Chou");
					
                    scan.nextLine();
                    System.out.println("You set off towards the mob's hideout to make things right when you come to a fork in the road."); 

                    System.out.println("To the Left is a dark, wet road with trees overhanging above.");
        
                    System.out.println("To the right appears to be sunny but you notice an odd toad in the middle of the road. Which way do you go?"); 
                    String lr = scan.nextLine();
					//LOOPS UNTIL LEFT/RIGHT IS CHOSEN
                    while (true) {
                        System.out.println("You ponder it. Which way do you go?");
                        lr = scan.nextLine();
                        if (lr.toLowerCase().equals("left") || lr.toLowerCase().equals("right")) {
                            break;
                        }               
                    }//GAME END
                    if (lr.toLowerCase().equals("left")) {
                        System.out.println("While walking down the dark road you are unable to see the cliff infront of you.");

                        scan.nextLine();
                        System.out.println("You slip on a wet leaf and fall... almost but not quite... off the cliff");
                        
                        scan.nextLine();
                        System.out.println("*gets up*");
                        
                        scan.nextLine();
                        System.out.println("This is not what you signed up for. You turn around to go to the nearest bao stall.");
                        System.exit(0);
						
                    } else if (lr.toLowerCase().equals("right")) {
                        System.out.println("As you get closer to the frog, it ribbits while starring at you and hops away.");
                        
						System.out.println("Not far ahead you see Myles, the evil mob boss.");
                        
						System.out.println("Will you fight? Yes/No");
                        String ny = scan.nextLine();
						//GAME END
                        if (ny.toLowerCase().equals("no")) {
                            System.out.println("Myles is quite intimidating. You think 'Fighting isn't always the answer.' and turn around.");
                            System.exit(0);
						//GAME END - WIN
                        } else if (ny.toLowerCase().equals("yes")) {
                            System.out.println("Myles laughs when he sees you and says 'are you supposed to take me down?'");

                            scan.nextLine();
                            System.out.println("It hurts, but it's not the first nor the last time you deal with rude people.");

                            System.out.println("You're prepared in your wrestling stance. As you move forward, Myles understands you're serious.");

                            scan.nextLine();
                            System.out.println("He gets scared and gives up.");

                            scan.nextLine();
                            System.out.println("CONGRATULATIONS! You have stopped Myles from further terrorizing the village.");
                            System.exit(0);
                        }
                    }//GAME END - ELSE IF SUMO/NINJA ISN'T CHOSEN 
                } else {
                    System.out.println("So you're here under your boss' order. Come back if you turn good.");
                    System.exit(0);
                }//GAME END - ELSE IF GOOD/BAD ISN'T CHOSEN
            } else {
                System.out.println("It seems you haven't chosen a side yet. Come back when you're ready.");
            }//GAME END - ELSE IF YES/NO ISN'T CHOSEN
        } else {
            System.out.println("I guess you don't want to play. See you next time.");
        }
    }
}
