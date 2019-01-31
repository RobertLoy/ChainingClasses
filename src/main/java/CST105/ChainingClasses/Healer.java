package CST105.ChainingClasses;

public class Healer extends Character {
	
	// Attribute for this class
	public boolean vertical = true;
	public static char success = 'N';
	
	public boolean isVertical() {
		return vertical;
	}
	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}
	public static char getSuccess() {
		return success;
	}
	public static void setSuccess(char success) {
		Healer.success = success;
	}

	

	
}
