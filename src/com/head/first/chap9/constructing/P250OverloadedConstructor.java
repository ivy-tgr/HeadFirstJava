package com.head.first.chap9.constructing;

public class P250OverloadedConstructor {
	public static void main(String[] args) {
		int weight = 8;
		float density = 2.3f;
		String name = "Donald";
		long[] feathers = { 1, 2, 3, 4, 5, 6 };
		boolean canFly = true;
		int airspeed = 22;

		Duck[] d = new Duck[7];

		d[0] = new Duck();
		d[1] = new Duck(density, weight);
		
		d[3] = new Duck(canFly);
		d[4] = new Duck(3.3f, airspeed);
		d[5] = new Duck(false);
		d[6] = new Duck(airspeed, density);
		d[2] = new Duck(name, feathers, density);
		new Duck(1, 1.6f);
	}
}

class Duck {
 
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

	public Duck() {
		System.out.println("type 1 Duck");
	}

	public Duck(boolean fly) {
		canFly = fly;
		System.out.println("type 2 Duck");
	}

	public Duck(String n, long[] f, float d) {
		this(d);
		name = n;
		feathers = f;
		System.out.println("type 3 Duck");
	}

	public Duck(int w, float f) {
		this(f);
		kilos = w;
		System.out.println("type 4 Duck");
	}

	public Duck(float density, int max) {
		this(density);
		maxSpeed = max;
		System.out.println("type 5 Duck");
	}

	private Duck(float floatability) {
		this.floatability = floatability;
		if (floatability < 1.2) {
			throw new IllegalArgumentException("floatability must be higher than 1,2 but was " + floatability);
		}
		System.out.print(floatability);
	}
}