package com.head.first.chap9.constructing;

public class P254Objects {
	public static void main(String[] args) {
		System.out.println("starting...");
		Hippo h = new Hippo();
	}
}

class Animal {
	public Animal() {
		System.out.println("Making an animal");
	}
}

class Hippo extends Animal {	
	public Hippo() {
		System.out.println("Making a Hippo");
	}
}

