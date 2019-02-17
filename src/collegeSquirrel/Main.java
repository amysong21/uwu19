package collegeSquirrel;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please name your squirrel");
		String CSName = scan.next();
		Squirrel nps = new YourSquirrel(CSName);
		System.out.println("let's start the game");
		System.out.println("round 1");
		System.out.println("Would you like to feed " + CSName + ": 1. French fries, 2. Sprite, 3. acorns, or 4. water");
		System.out.println ("enter the number");
		int food = scan.nextInt();
		Update npsStatus = new UpdateStatus(nps);
		npsStatus.feedFood(food, nps);
		npsStatus.updateStatus();
		npsStatus.letsExercise(nps);
		npsStatus.updateStatus();
		npsStatus.aliveHello();
	}
}


