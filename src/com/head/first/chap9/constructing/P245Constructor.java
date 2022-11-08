package com.head.first.chap9.constructing;

class Duck {
	int size;

	public Duck(int duckSize) {
		System.out.println("Quack");
		
		size = duckSize;
		System.out.println("size is " + size);
	}

	public void setSize(int newSize) {
		size = newSize;
	}
	
	public void size() {
		
	}
}

public class P245Constructor {

	public static void main(String[] args) {
		Duck d = new Duck(42);
		d.size();

	}
}