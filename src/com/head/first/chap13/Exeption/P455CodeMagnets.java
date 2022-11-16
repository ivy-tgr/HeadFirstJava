package com.head.first.chap13.Exeption;

class MyEx extends Exception { }

public class P455CodeMagnets {
	public static void main(String[] args) {
		String test = "no";
		try {
			System.out.print("t");
			doRisky1(test);
			System.out.print("o");
		} catch (MyEx e) {
			System.out.print("a");
		} finally {
			System.out.print("w");
		}
		System.out.println("s");
	}
	
	static void doRisky1(String t) throws MyEx {
		System.out.print("h");
		
		if ("yes".equals(t)) {
			throw new MyEx();
		}
		
		System.out.print("r");
	}
}