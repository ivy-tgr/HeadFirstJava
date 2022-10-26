package com.head.first.chap4.methods;

public class P84InstanceVariables {

	public static void main(String[] args) {
		Dog one = new Dog();
		System.out.println("Dog size is " + one.getSize());
		System.out.println("Dog name is " + one.getName());

	}

}

class Dog {
	private int size;
	private String name;

	public int getSize() {
		return size;
		
	}

	public String getName() {
		return name;
	}
	
}