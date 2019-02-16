package uwu19;

import java.util.Scanner;

public class OwO {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how are you: good, bad, meh");
		String uwuResponse = scan.next();
		while (!uwuResponse.equals("next, please")) {
			if (uwuResponse.equals("good")) {
				System.out.println("uwu im proud you are good");
				
			} else if (uwuResponse.equals("bad")) {
				System.out.println("uwu i hope you will feel better");
				
			} else if (uwuResponse.equals("meh")) {
				System.out.println("uwu you are going to have an awesome day");
				
			}else if (uwuResponse.equals("next, please")){
				break;
			} else if (!(uwuResponse.equals("good") && uwuResponse.equals("bad") && uwuResponse.equals("meh"))){
				System.out.println("owo enter something please");
			} 
			uwuResponse = scan.next();
		}
		if (uwuResponse.equals("next, please")) {
			System.out.println ("owo what would you like");
		}
	}
	
	public static void letsUWU (String uwuNext) {
		
	}
}
