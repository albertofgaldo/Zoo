package Domain;

public class Chicken extends Bird{
	private boolean isBroiler;

	public Chicken (String name, String favoFood, double lenOfWin, boolean isBroiler) {
		super(name, favoFood, lenOfWin);
		this.isBroiler=isBroiler;
	}
	
	public boolean isBroiler() {
		return isBroiler;
	}

	public void setBroiler(boolean isBroiler) {
		this.isBroiler = isBroiler;
	}
	
}
