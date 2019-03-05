package View;

import java.util.Scanner;

import Application.AnimalController;
import Domain.Animal;
import Domain.Chicken;
import Domain.Dog;
import Domain.Parrot;

public class Main {
	private static AnimalController controller = new AnimalController();
	
	public static void main(String[] args) {		
		insertDog();
		insertParrot();
		insertChicken();
		selectOption();		
	}
	
//Inserts for dogs with example values
private static void insertDog() {
	controller.createDog("Killian", "Meat", "Hunting dog");
	controller.createDog("Peter", "Pedigree", "Sport dog");
	controller.createDog("Rocky dog", "Fresh meat", "Working dog");
}

//Inserts for parrots with example values
private static void insertParrot() {
	controller.createParrot("Parrot one", "Grain", 0.25, false);
	controller.createParrot("Parrot two", "Corn", 0.5, true);
}

//Inserts for chickens with example values
private static void insertChicken() {
	controller.createChicken("Chicken one", "Corn", 0.75, true);
	controller.createChicken("Rocky chicken", "Corn", 0.75, false);
}

//main menu
 private static void showMenu() {
         System.out.println("[1]. List all animals, properties and friends");
         System.out.println("[2]. Live one day");
         System.out.println("[3]. Exit");       
 }

 //selector for menu
 private static void selectOption() {
         int opc = 3;
         Scanner sc = new Scanner(System.in);
         do{
             showMenu();
             opc = Integer.parseInt(sc.nextLine());
             switch (opc) {
                 case 1:
                	 showAnimals();             
                     break;
                 case 2:
                	 liveOnDay();
                     break;               
             }
         } while (opc != 3);
 }

 //show each animal and filter the properties in function of his instance
private static void showAnimals() {
	for(Animal animal : controller.repository.getZoo()) {
		System.out.println("Name: "+animal.getName());
		System.out.println("Favorite food: "+animal.getFavoFood());
		//go inside if the animal has some friend
		if(!animal.getFriends().isEmpty()) {
			System.out.println("Friends: ");
			showFriends(animal);
		}
		//show properties depending of his instance
		if(animal instanceof Dog) {
			System.out.println("Type: "+((Dog) animal).getType());
		}else if(animal instanceof Parrot) {
			System.out.println("Can speak? "+((Parrot) animal).isSpeak());
		}else if(animal instanceof Chicken) {
			System.out.println("Broiler? "+((Chicken) animal).isBroiler());
		}
		System.out.print("\n");
	}
}

//show friends for each animal
private static void showFriends(Animal animal) {
	for(Animal friend : animal.getFriends()) {
		System.out.println(friend.getName());
	}
}

//make and lose friends
public static void liveOnDay() {
	for(Animal animal : controller.repository.getZoo()) {
		//lose friend - enter only if it has some friend
		if(!animal.getFriends().isEmpty()) {
			System.out.println(animal.getName() + " lost " + controller.loseFriend(animal).getName() +" as a friend and viceversa.");
		}				
	}
	System.out.print("\n");
	
	for(Animal animal : controller.repository.getZoo()) {		
		//make friend
		System.out.println(animal.getName() + " is friend with " + controller.makeFriend(animal).getName() +" and viceversa.");		
	}
	System.out.print("\n");
}

}

