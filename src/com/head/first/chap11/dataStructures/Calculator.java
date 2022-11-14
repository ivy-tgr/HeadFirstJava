package com.head.first.chap11.dataStructures;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		calculator calc = new calculator();

		System.out.println("Wilkommen beim Taschenrechener");

		System.out.println(
				"Geben sie ein ob sie Addieren (a) subtrahieren (s) multiplizieren (m) dividieren (d) möchten");
		@SuppressWarnings("resource")

		Scanner operator = new Scanner(System.in);
		String Operator = operator.nextLine();
		System.out.println(Operator);

		System.out.println("Geben sie die erste Zahl ein");
		String FirstNumber = operator.nextLine();
		int Number1 = Integer.parseInt(FirstNumber);

		System.out.println("Geben sie die zweite Zahl ein");
		String SecondNumber = operator.nextLine();
		int Number2 = Integer.parseInt(SecondNumber);

		if (Operator.equals("a")) {
			calc.Add(Number1, Number2);

		} else if (Operator.equals("s")) {
			calc.subtract(Number1, Number2);

		} else if (Operator.equals("m")) {
			calc.multiply(Number1, Number2);

		} else if (Operator.equals("d")) {
			calc.divide(Number1, Number2);

		}
		System.out.println(calc.result);
	}

}

class calculator {
	public int result;

	public int Add(int Number1, int Number2) {
		result = Number1 + Number2;
		System.out.println(result);
		do {
			System.out.println("Geben sie eine Weitere Zaahl ein ein");
			Scanner one = new Scanner(System.in);
			String thirdNumber = one.nextLine();
			int Number3 = Integer.parseInt(thirdNumber);
			result = result + Number3;
			System.out.println(result);
		} while (true);

	}

	public int subtract(int Number1, int Number2) {
		result = Number1 - Number2;
		System.out.println(result);
		return result;
	}

	public int multiply(int Number1, int Number2) {
		result = Number1 * Number2;
		System.out.println(result);
		return result;
	}

	public int divide(int Number1, int Number2) {
		result = Number1 / Number2;
		System.out.println(result);
		return result;
	}

}
