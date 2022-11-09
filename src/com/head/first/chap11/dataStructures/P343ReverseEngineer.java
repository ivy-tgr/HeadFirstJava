package com.head.first.chap11.dataStructures;

import java.util.*;

public class P343ReverseEngineer {
	public static void main(String[] args) {
		new P343ReverseEngineer().go();
	}

	public void go() {
		List<Mountain> mountains = new ArrayList<>();
		mountains.add(new Mountain("Longs", 14255));
		mountains.add(new Mountain("Elbert", 14433));
		mountains.add(new Mountain("Maroon", 14156));
		mountains.add(new Mountain("Castle", 14265));
		System.out.println("as entered: \n" + mountains);

		mountains.sort((mount1, mount2) -> mount1.name.compareTo(mount2.name));
		System.out.println("by name : \n" + mountains);

		mountains.sort((mount1, mount2) -> mount2.height - mount1.height);
		System.out.println("by name : \n" + mountains);
	}
}

class Mountain {
	String name;
	int height;

	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String toString() {
		return name + " " + height;
	}
}
