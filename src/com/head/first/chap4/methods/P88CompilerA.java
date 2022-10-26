package com.head.first.chap4.methods;

public class P88CompilerA {

	public static void main(String[] args) {
		int orig = 42;
		P88CompilerA x = new P88CompilerA();
		
		int y = x.go(orig);
		System.out.print(orig + "" + y);
		}
	int go(int arg) {
		arg = arg * 2;
		return arg;
	}

}
