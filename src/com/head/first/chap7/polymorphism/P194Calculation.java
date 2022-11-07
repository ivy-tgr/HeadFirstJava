package com.head.first.chap7.polymorphism;

class A {
	int ivar = 7;

	void m1() {
		System.out.print("A's m1, ");
	}

	void m2() {
		System.out.print("A's m2, ");
	}

	void m3() {
		System.out.print("A's m3, ");
	}

}

class B extends A {
	void m1() {
		System.out.print("B's m1, ");
	}
}

class C extends A {
	void m3() {
		System.out.print("C's m3, " + (ivar + 6));
	}
}

public class P194Calculation {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		b.m1();
		c.m2();
		a.m3();
	}
}