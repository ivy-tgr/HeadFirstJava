package com.head.first.chap1.surface;

public class P16Conditions {

	public static void main(String[] args) {
		int bottlesNum = 10;
		String word = "bottles";
		while (bottlesNum > 0) {

			if (bottlesNum == 1) {
				word = "bottle";
			}

			System.out.println(bottlesNum + " green " + word + " hanging on the wall");
			System.out.println("and if one bottle fall");
			bottlesNum = bottlesNum - 1;

			if (bottlesNum > 0) {
				System.out.println("there'll be " + bottlesNum + " green " + word + ", hanging on the wall");

			} else {
				System.out.println("there'll be no " + word + " hanging on the wall");
			}
		}

	}

}
