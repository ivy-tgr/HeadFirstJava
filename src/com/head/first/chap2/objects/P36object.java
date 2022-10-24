package com.head.first.chap2.objects;

public class P36object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Dog {
	int size;
	int age;
	String name;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}

class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 40;
		d.age = 12;
		d.bark();
		System.out.println(d.age);
	}

}