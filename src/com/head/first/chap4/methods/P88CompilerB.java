package com.head.first.chap4.methods;

public class P88CompilerB {
	public static void main(String[] args) {
		Clock c = new Clock();

		c.setTime("12:45");
		String tod = c.getTime();
		System.out.println("time:" + tod);
	}
}

class Clock {
	String time;

	void setTime(String t) {
		time = t;
	}

	String getTime() {
		return time;
	}
}
