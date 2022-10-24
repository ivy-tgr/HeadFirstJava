package com.head.first.chap1.surface;

import java.util.Random;

public class P18Array {

	public static void main(String[] args) {
		String[] wordOne = { "Only", "Don’t", "I", "Eva" };
		String[] wordTwo = { "believe", "Dream", "fly", "dance" };

		int dogLength = wordOne.length;
		int catLength = wordTwo.length;

		java.util.Random randomGenerator = new Random();
		int random1 = randomGenerator.nextInt(dogLength);
		int random2 = randomGenerator.nextInt(catLength);

		String phrase = wordOne[random1] + "" + wordTwo[random2];
		System.out.println("The Name of the word is " + phrase);
	}

}
