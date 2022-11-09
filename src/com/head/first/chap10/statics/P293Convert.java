package com.head.first.chap10.statics;

public class P293Convert {
	private Integer i = 9;
	private int j;
	public String s = "23";

	public static void main(String[] args) {
		P293Convert t = new P293Convert();
		t.go();

	}

	public void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);

		double e = 24.5;
		Double.toString(e);
		System.out.println(e);

		Integer.parseInt(s);
		System.out.println(s);

		long mybillion = 1_000_000_000;
		String s = String.format("%,d", mybillion);
		System.out.println(s);

		String f = String.format("I have %,.2f, bugs to fix.", 432327.23882);
		System.out.println(f);

		

	}

}
