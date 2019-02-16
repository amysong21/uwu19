package collegeSquirrel;

public interface Squirrel {
	String getName();
	boolean isAAlive();
	int getHealthLevel();
	int getHungerLevel();
	int getThirstLevel();
	void newStatus(int health, int hunger, int thirst);
	
}
