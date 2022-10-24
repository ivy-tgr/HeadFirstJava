package com.head.first.chap1.surface;

public class P23Calculation {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {

			if (y < 5) {
				x = x + 1;
				if (y < 3) {
					x = x - 1;
				}
			}
			y = y + 2;

			System.out.println(x + "" + y + "");
			x = x + 1;
		}

	}

}
