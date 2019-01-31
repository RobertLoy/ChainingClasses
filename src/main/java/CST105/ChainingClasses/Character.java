package CST105.ChainingClasses;

public class Character
{
	// Class Attributes
	private String name = "Lois";
	private int health = 10;
	private String catchPhrase = "Hello";

    
	// Class Getter/Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setHealth(String phrase) {
		this.catchPhrase = phrase;
	}
    
    public void talk() {
		System.out.println(this.name + " says, \"" + catchPhrase + "!\"");   	
    }
    
    public void updateHealth(int health) {
    	this.health = this.health + health;
		System.out.println(this.name + " new health is " + this.health + "!\"");     	
    }
}
