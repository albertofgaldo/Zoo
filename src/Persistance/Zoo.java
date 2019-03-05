package Persistance;

import java.util.ArrayList;
import java.util.List;

import Domain.Animal;

public class Zoo {
	public List<Animal> zoo;
	
	public Zoo() {
		this.zoo = new ArrayList<Animal>();
	}

	public List<Animal> getZoo() {
		return zoo;
	}

	protected void setZoo(List<Animal> zoo) {
		this.zoo = zoo;
	}
	
	protected void addAnimalZoo(Animal animal) {
		zoo.add(animal);
	}
	
	protected void removeAnimalZoo(Animal animal) {
		zoo.remove(animal);
	}
	
	protected void clearZoo() {
		zoo.clear();
	}
}
