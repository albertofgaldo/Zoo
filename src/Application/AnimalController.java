package Application;

import java.util.Random;

import Domain.*;
import Persistance.Zoo;

public class AnimalController {
	//to manage the repository
	public Zoo repository = new Zoo();
	
	public AnimalController() {}
	
	//Add diferents kinds of animals
	public void createChicken(String name, String favoFood, double lenOfWin, boolean isBroiler){
		Chicken chicken = new Chicken(name, favoFood, lenOfWin, isBroiler);
		repository.zoo.add(chicken);
	}
	
	public void createParrot(String name, String favoFood, double lenOfWin, boolean speak){
		Parrot parrot = new Parrot(name, favoFood, lenOfWin, speak);
		repository.zoo.add(parrot);
	}
	
	public void createDog(String name, String favoFood, String type){
		Dog dog = new Dog(name, favoFood, type);
		repository.zoo.add(dog);
	}
	
	//the animal lose a random friend
	public Animal loseFriend(Animal animal) {
		Animal animalRandom;
		
		do {		
			//the random friend is storaged
			animalRandom=getRandomAnimal();
		//animal random can't be the same we are working about and it would have the animal that we want remove.
		}while(animal.equals(animalRandom)||!animal.loseFriend(animalRandom));
		//If A is friend with B then B is friend of A
		repository.zoo.get(repository.zoo.indexOf(animalRandom)).loseFriend(animal);
		return animalRandom;
	}
	
	//the animal make a friend
	public Animal makeFriend(Animal animal) {
		Animal animalRandom;
		
		do {		
			//the random friend is storaged
			animalRandom=getRandomAnimal();
		//animal random can't be the same we are working about and the new friend can't be repeated.
		}while(animal.equals(animalRandom)||!animal.makeFriend(animalRandom));
		//If A is friend with B then B is friend of A
		repository.zoo.get(repository.zoo.indexOf(animalRandom)).makeFriend(animal);
		return animalRandom;
	}
	
	//return the random animal
	public Animal getRandomAnimal() {
		return repository.zoo.get((new Random()).nextInt(repository.zoo.size()));
	}
	

}
