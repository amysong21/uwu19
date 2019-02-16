package collegeSquirrel;

public class YourSquirrel implements Squirrel {


	protected String name;
	protected int healthLevel;
	protected int hungerLevel;
	protected boolean alive;
	protected int thirstLevel;
	
	public YourSquirrel (String name) {
		this.name = name;		
		healthLevel = 0;
		hungerLevel = 0;
		thirstLevel = 0;
		alive = true;
		if (this.name == null) {
			throw new RuntimeException("NAME YOUR SQUIRREL");
		}
	}
	
	@Override
	public String getName() {
		return name;
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
