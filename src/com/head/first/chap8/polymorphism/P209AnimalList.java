package com.head.first.chap8.polymorphism;

class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal a) {
		if (nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}

	public void add(Dog dog) {
		
	}

	public void add(Cat cat) {
		
	}


}


public class P209AnimalList {

	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Dog dog = new Dog();
		Cat cat = new Cat();
		list.add(dog);
		list.add(cat);

	}

}
class Animal {
	
}
class MyDogList{
	private Dog[] dogs = new Dog[5];
	private int nextIndex = 0;
	
	public void add(Dog d) {
		if (nextIndex < dogs.length) {
			dogs[nextIndex] = d;
			System.out.println("Dog added at " + nextIndex);
			nextIndex++;
		}
		
	}
	
} 
class Dog{
	
}
class Cat{
	
}