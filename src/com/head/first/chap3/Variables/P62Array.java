package com.head.first.chap3.Variables;

public class P62Array {
	String name;

	public static void main(String[] args) {

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = new Dog();
		

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		myDogs[2].name = "Tobias";

		int y = 0;

		System.out.println("The dog names are:");

		while (y < 3) {
			System.out.println(myDogs[y].name);
			y = y + 1;

		}

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}

}

class Dog {

	String name;

	public void bark() {
		System.out.println(name + " Ruff, Ruff");

	}

}