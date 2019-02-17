package collegeSquirrel;

public class GameRounds implements Rounds {

	protected int roundNum = 0;
	protected Squirrel player;
	
	public GameRounds (Squirrel player) {
		roundNum = 1;
		this.player = player;
		System.out.println("let's start the game"); 
		System.out.println("round " + roundNum);
		System.out.println("Would you like to feed " + player.getName() + ": 1. French fries, 2. Sprite, 3. acorns, or 4. water");
		System.out.println ("enter the number");
		roundNum++;
	}
	
	@Override
	public int getRound() {
		// TODO Auto-generated method stub
		return roundNum;
	}

	@Override
	public void rounds() {
		if (player.isAlive()) {
			System.out.println("Your squirrel has not died. Let's continue");
			System.out.println("round " + roundNum);
			System.out.println("Would you like to feed " + player.getName() + ": 1. French fries, 2. Sprite, 3. acorns, or 4. water");
			System.out.println ("enter the number");
		}
		if (roundNum >= 10) {
			System.out.println("You have reached the ultimate level");
			System.out.println("YOU WON! CONGRATS");
		}
		
		roundNum++;
	}

}
