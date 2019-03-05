package Domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	private int id;
	private String name;
	private String favoFood;
	private List<Animal> friends;
	private static int counter=1;
	
	public Animal() {
		this.friends= new ArrayList<>();
	}
	
	public Animal(String name, String favoFood) {
		this.id=counter;
		this.name=name;
		this.favoFood=favoFood;
		this.friends= new ArrayList<>();
		Animal.counter++;		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFavoFood() {
		return favoFood;
	}
	protected void setFavoFood(String favoFood) {
		this.favoFood = favoFood;
	}
	public List<Animal> getFriends() {
		return friends;
	}
	protected void setFriends(List<Animal> friends) {
		this.friends = friends;
	}
	
	public boolean makeFriend(Animal animal) {
		if(!friends.contains(animal)) {
			friends.add(animal);
			return true;
		}
		return false;		
	}
	
	public boolean loseFriend(Animal animal) {
		if(friends.contains(animal)) {
			friends.remove(animal);
			return true;
		}
		return false;		
	}
}

