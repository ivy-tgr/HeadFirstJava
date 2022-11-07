package com.head.first.chap5.program;

import java.util.Scanner;

public class P103shipGameTest {

	public static void main(String[] args) {
		P103ShipGameSimple dot = new P103ShipGameSimple();

		int[] locations = { 2, 3, 4 };
		dot.setLocationCells(locations);

		int userGuess = 2;
		String result = dot.checkYourself(userGuess);

		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";

		}
		System.out.println(testResult);
	}
}

class GameHelper {
	public int getUserInput(String prompt) {
		System.out.print(prompt + ":");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
