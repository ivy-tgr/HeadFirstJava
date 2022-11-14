package com.head.first.chap9.constructing;

public class PiratenConsti {

	public static void main(String[] args) {
		Pirate jack = new Pirate("Jack"); // Calls first constructor
		Pirate john = new Pirate(true); // Calls second constructor
		Pirate joey = new Pirate("Joey", false); // Calls third constructor
		System.out.println(jack);
	}

}

class Pirate {
	private String _name;

	private boolean _hasEyePatch;

	public Pirate(String name) {
		this(name, false);
		name = "jach";
	}

	public Pirate(boolean hasEyePatch) {
		this(null, hasEyePatch);
	}

	public Pirate(String name, boolean hasEyePatch) {
		int x = 2;
		int y = 2;
		if (x == y) {

			_name = name.toUpperCase();
		}
		_hasEyePatch = hasEyePatch;
	}

}
