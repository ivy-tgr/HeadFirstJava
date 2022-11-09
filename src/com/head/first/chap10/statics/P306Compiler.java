package com.head.first.chap10.statics;

class StaticSuper {
	static {
		System.out.println("Super static block");
	}

	StaticSuper() {
		System.out.println("super constructor");
	}
}
	
public class P306Compiler extends StaticSuper{
	static int rand;
	
	static {
		rand = (int) (Math.random() * 6);
		System.out.println("static block " + rand);
	}
	
	P306Compiler() {
		System.out.println("constructor");
		
	}
	public static void main(String[] args) {
		System.out.println("in main");
		P306Compiler st = new P306Compiler();
		st.Print();
		
	}
	
	public void Print() {
		String t = String.format("My favorite number is %,.2f",2478234992.4324);
		System.out.println(t);
	}

}
