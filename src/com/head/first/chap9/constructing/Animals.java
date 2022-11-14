package com.head.first.chap9.constructing;

public class Animals {
	public static void main(String[] args) {
		Tiger simba = new Tiger("simba", 3.4f, 34, 3.3f);

		System.out.println(simba._name);
		System.out.println(simba._height);
		System.out.println(simba._age);
		System.out.println(simba._weight);

	}

}

class Tiger {
	public String _name;
	public float _height;
	public int _age;
	public float _weight;

	public Tiger(String name, float height) {
		_name = "joe";
		_height = height;
		System.out.println("1");

	}

	public Tiger(String name, float height, int age) {
		this(name, height);
		_name = name;
		_height = height;
		System.out.println("2");
	}

	public Tiger(float height, float weight) {
		this("simbva", weight);
		_height = 23;
		System.out.println("3");
	}

	public Tiger(String name, float height, int age, float weight) {

		_name = "jack";
		_height = height;
		_age = 23;
		_weight = weight;
		System.out.println("4");
	}

}