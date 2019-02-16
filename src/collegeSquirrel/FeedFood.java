package collegeSquirrel;

public class FeedFood extends YourSquirrel implements Food {

	protected String name;
	protected int changingHunger;
	protected int changingHealth;
	protected int changingThrist;
	protected boolean stillAlive;

	public FeedFood (String CSname, String name) {
		super(CSname);
		this.name = name;
		YourSquirrel.getHungerLevel() 
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int changeLevels() {
		// TODO Auto-generated method stub
		return 0;
	}

}
