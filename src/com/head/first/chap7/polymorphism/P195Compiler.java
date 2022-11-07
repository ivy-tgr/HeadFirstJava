package com.head.first.chap7.polymorphism;

public class P195Compiler {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Vampire();
		monsters[1] = new Dragon();
		monsters[2] = new Monster();
		for (int i = 0; i < monsters.length; i++) {
			monsters[i].frighten(i);
		}
	}

}

class Monster{
	boolean frighten (int d) {
		System.out.println("arrrgh");
		return true;
	}
}

class Vampire extends Monster {
	boolean frigthen (int x) {
		System.out.println("a bite");
		return false;
	}
}

class Dragon extends Monster{
	boolean frighten (int degree) {
		System.out.println("breathe fire");
		return true;
	}
}
