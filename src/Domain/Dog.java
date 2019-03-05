package Domain;

public class Dog extends Mammal {
	private String type;
	
	public Dog (String name, String favoFood, String type) {
		super(name, favoFood);
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
