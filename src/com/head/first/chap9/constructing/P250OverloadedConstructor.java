package com.head.first.chap9.constructing;

public class P250OverloadedConstructor {
	public static void main(String[] args) {
		int weight = 8;
		float density = 2.3f;
		String name = "Donald";
		long[] feathers = { 1, 2, 3, 4, 5, 6 };
		boolean canFly = true;
		int airspeed = 22;

		Cat[] d = new Cat[7];

		d[0] = new Cat();
		d[1] = new Cat(density, weight);
		d[2] = new Cat(name, feathers);
		d[3] = new Cat(canFly);
		d[4] = new Cat(3.3f, airspeed);
		d[5] = new Cat(false);
		d[6] = new Cat(airspeed, density);
	}
}

class Cat {
	@SuppressWarnings("unused")
	private int kilos = 6;
	@SuppressWarnings("unused")
	private float floatability = 2.1f;
	@SuppressWarnings("unused")
	private String name = "Generic";
	@SuppressWarnings("unused")
	private long[] feathers = { 1, 2, 3, 4, 5, 6, };
	@SuppressWarnings("unused")
	private boolean canFly = true;
	@SuppressWarnings("unused")
	private int maxSpeed = 25;
 
	public Cat() {
		System.out.println("type 1 Cat");
	}

	public Cat(boolean fly) {
		canFly = fly;
		System.out.println("type 2 Cat");
	}

	public Cat(String n, long[] f) {
		name = n;
		feathers = f;
		System.out.println("type 3 Cat");
	}

	public Cat(int w, float f) {
		kilos = w;
		floatability = f;
		System.out.println("type 4 Cat");
	}

	public Cat(float density, int max) {
		floatability = density;
		maxSpeed = max;
		System.out.println("type 5 Cat");
	}

}