package collegeSquirrel;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please name your squirrel");
		String CSName = scan.next();
		Squirrel nps = new YourSquirrel(CSName);
		Rounds gameStart = new GameRounds(nps);
		while (gameStart.getRound() <= 10 && nps.isAlive()) {		
			int food = scan.nextInt();
			Update npsStatus = new UpdateStatus(nps);
			npsStatus.feedFood(food, nps);
			npsStatus.updateStatus();
			npsStatus.letsExercise(nps);
			npsStatus.updateStatus();
			npsStatus.aliveHello();
			gameStart.rounds();
		}
		if (!nps.isAlive()) {
			for (int i = 0; i < 1; i++) {
				break;
			}
		}

	}
}


