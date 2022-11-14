package com.head.first.chap9.constructing;

public class P253OverloadedConstructor {
	public static void main(String[] args) {
		Pirate1 jack = new Pirate1(3.9f);
		System.out.println(jack.Cruetly);
		
	}
}

class Pirate1 {
	private int _age;

	public float Cruetly;

	public Pirate1(float cruetly) {
		this(18, cruetly);
		_age = 21;
		Cruetly = cruetly;
	}

	public Pirate1(int age) {

		this(age, 2.6f);

		_age = age;
		Cruetly = 4.1f;
	}

	public Pirate1(int age, float cruetly) {
		_age = age;
		Cruetly = cruetly;
		System.out.println(cruetly);
		System.out.println(Cruetly);
		System.out.println(age);
		System.out.println(_age);
	}
}