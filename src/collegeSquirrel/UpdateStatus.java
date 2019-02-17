package collegeSquirrel;

import java.util.Scanner;

public class UpdateStatus implements Update {

	protected Squirrel player;
	
	public UpdateStatus (Squirrel player) {
		this.player = player;
	}
	
	@Override
	public void updateStatus() {

		if (this.player.isAlive()) {
			System.out.println("your squirrel's health level is " + player.getHealthLevel() * 10 + "%");
			System.out.println("your squirrel's hunger level is " + player.getHungerLevel() * 10 + "%");
			System.out.println("your squirrel's thirst level is " + player.getThirstLevel() * 10 + "%");
		}		
	}
	
	@Override
	public void feedFood(int food, Squirrel player) {
		Scanner scan = new Scanner (System.in);
		this.player = player;
		int hunger = player.getHungerLevel();
		int health = player.getHealthLevel();
		int thirst = player.getThirstLevel();
		if (!(food == 1 || food == 2 || food == 3 || food == 4)) {
			System.out.println("please retype, and type as instructed");
			int again = scan.nextInt();
			feedFood(again, player);
		} else if (food == 1) {
			hunger-= 2;
			health--;
			player.newStatus(health, hunger, thirst);
		} else if (food == 2) {
			health--;
			thirst--;
			player.newStatus(health, hunger, thirst);
		} else if (food == 3) {
			health++;
			hunger--;
			player.newStatus(health, hunger, thirst);
		} else if (food == 4) {
			thirst -= 2;
			health++;
			player.newStatus(health, hunger, thirst);

		}
		
	}
	
	@Override
	public void letsExercise(Squirrel player) {
		Scanner scan = new Scanner (System.in);
		int hunger = player.getHungerLevel();
		int health = player.getHealthLevel();
		int thirst = player.getThirstLevel();
		if (player.getHungerLevel() <= 0 || player.getHealthLevel() <= 0 || player.getThirstLevel() <= 0 ) {
			hunger += 2;
			health += 2;
			thirst += 2;
			if (health >= 10) {
				health = 10;
			}
			player.newStatus(health, hunger, thirst);
			System.out.println("your squirrel has exercised");
		} else {
			System.out.println(player.getName() + " is in good shape; would you still like to make your squirrel exercise?");
			System.out.println("if yes, please enter 0");
			if (scan.nextInt() == 0) {
				hunger += 2;
				health += 2;
				thirst += 2;
				if (health >= 10) {
					health = 10;
				}
				player.newStatus(health, hunger, thirst);
			}
		}
		
	}
	
	@Override
	public void aliveHello() {
		if (player.isAlive()) {
			System.out.println("your squirrel is alive");
		} else {
			System.out.println("your squirrel is dead");
			System.out.println("ending the game ...");
//			break;
		}
	

	}
	
}
