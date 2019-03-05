package Domain;

public class Bird extends Animal {
	private double lenOfWin;
	
	public Bird (String name, String favoFood, double lenOfWin) {
		super(name, favoFood);
		this.lenOfWin=lenOfWin;
		
	}

	public double getLenOfWin() {
		return lenOfWin;
	}

	public void setLenOfWin(double lenOfWin) {
		this.lenOfWin = lenOfWin;
	}
	
}
