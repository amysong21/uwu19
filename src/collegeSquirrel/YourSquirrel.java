package collegeSquirrel;

public class YourSquirrel implements Squirrel {


	protected String CSname;
	protected int healthLevel;
	protected int hungerLevel;
	protected boolean alive;
	protected int thirstLevel;
	
	public YourSquirrel (String name) {
		this.CSname = name;		
		healthLevel = 8;
		hungerLevel = 2;
		thirstLevel = 2;
		alive = true;
		if (this.CSname == null) {
			throw new RuntimeException("NAME YOUR SQUIRREL");
		}
	}
	
	public void newStatus (int health, int hunger, int thirst) {
		this.healthLevel = health; 
		this.hungerLevel = hunger;
		this.thirstLevel = thirst;
	}
	
	@Override
	public String getName() {
		return CSname;
	}

	@Override
	public boolean isAlive() {
		if (healthLevel < 0 || hungerLevel > 10 || thirstLevel > 10) {
			return false;
		}
		return true;
	}

	@Override
	public int getHealthLevel() {
		return healthLevel;
	}

	@Override
	public int getHungerLevel() {
		return hungerLevel;
	}

	@Override
	public int getThirstLevel() {
		return thirstLevel;
	}

}
