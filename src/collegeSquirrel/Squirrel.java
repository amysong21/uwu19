package collegeSquirrel;

public interface Squirrel {
	String getName();
	boolean isAlive();
	int getHealthLevel();
	int getHungerLevel();
	int getThirstLevel();
	void newStatus(int health, int hunger, int thirst);
	
}
