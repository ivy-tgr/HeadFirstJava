package com.head.first.chap9.constructing;

class Cat {
	int size;

	public Cat(int CatSize) {
		System.out.println("Quack");
		
		size = CatSize;
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
		Cat d = new Cat(42);
		d.size();

	}
}
