package Domain;

public class Parrot extends Bird {
	private boolean speak;

	public Parrot (String name, String favoFood, double lenOfWin, boolean speak) {
		super(name, favoFood, lenOfWin);
		this.speak=speak;
	}
	
	public boolean isSpeak() {
		return speak;
	}

	public void setSpeak(boolean speak) {
		this.speak = speak;
	}
	
}
