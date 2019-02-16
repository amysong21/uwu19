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
				scan.next();
			} else if (uwuResponse.equals("bad")) {
				System.out.println("uwu i hope you will feel better");
				scan.next();
			} else if (uwuResponse.equals("meh")) {
				System.out.println("uwu you are going to have an awesome day");
				scan.next();
			}else if (uwuResponse.equals("next, please")){
				break;
			} else if (!(uwuResponse.equals("good") && uwuResponse.equals("bad") && uwuResponse.equals("meh"))){
				System.out.println("owo enter something please");
				scan.next();
			} 
			break;
		}
	}
	
	public static void letsUWU (String uwuNext) {
		
	}
}
