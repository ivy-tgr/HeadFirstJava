package com.head.first.chap9.constructing;

public class P268GarbageCollector {
	public static P268GarbageCollector doStuff() {
		P268GarbageCollector newGC = new P268GarbageCollector();
		dostuff2(newGC);
		return newGC;
	}
	public static void main(String[] args) {
		P268GarbageCollector gc1;
		P268GarbageCollector gc2 = new P268GarbageCollector();
		P268GarbageCollector gc3 = new P268GarbageCollector();
		P268GarbageCollector gc4 = gc3;
		gc1 = doStuff();
		
		gc1 = null;
		gc2 = null;
		gc1 = gc4;
	}
	

	public static void dostuff2 (P268GarbageCollector copyGC) {
		P268GarbageCollector localGC = copyGC;
	}

}