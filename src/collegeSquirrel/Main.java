package collegeSquirrel;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.println("please name your squirrel");
		String CSName = scan.next();
		Squirrel nps = new YourSquirrel(scan.next());
		System.out.println("let's start the game");
		System.out.println("round 1");
		System.out.println("Would you like to feed " + CSName + ": French fries, Sprite, acorns, or water");
		
		
	}
	
	public static void feeding (String food, Squirrel player) {
		int hunger = player.getHungerLevel();
		int health = player.getHealthLevel();
		int thirst = player.getThirstLevel();
		if (!(food.equals("French fries") && food.equals("Sprite") && food.equals("acorns") && food.equals("water"))) {
			throw new RuntimeException ("PLEASE TYPE AS INSTRUCTED");
		}
		if (food.equals("French fries")) {
			hunger-= 3;
			health--;
			player.newStatus(health, hunger, thirst);
		} else if (food.equals("Sprite")) {
			health--;
			thirst--;
			player.newStatus(health, hunger, thirst);
		} else if (food.equals("acorns")) {
			health++;
			hunger--;
			player.newStatus(health, hunger, thirst);
		} else if (food.equals("water")) {
			thirst -= 2;
			health++;
		}
	}
}
