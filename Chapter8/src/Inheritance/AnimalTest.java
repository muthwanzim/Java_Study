package Inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("animal is moving");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("Human moves with two legs");
	}
	
	public void readBook() {
		System.out.println("Human reads book");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("Tiger moves with four legs");
	}
	
	public void hunting() {
		System.out.println("Tiger hunts");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle flies with wings");
	}
	
	public void flying() {
		System.out.println("Eagle flies");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		/*
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		*/
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if(animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		} else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		} else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		} else {
			System.out.println("What is this?");
		}
		
	}

}
