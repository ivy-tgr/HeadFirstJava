package com.head.first.chap11.dataStructures;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		calculator calc = new calculator();

		System.out.println("Wilkommen beim Taschenrechener");

		System.out.println(
				"Geben sie ein ob sie Addieren (a) subtrahieren (s) multiplizieren (m) dividieren (d) möchten");
		Scanner operator = new Scanner(System.in);
		String Operator = operator.nextLine();
		System.out.println(Operator);
		
		System.out.println("Geben sie die erste Zahl ein");
		int Number1 = operator.nextInt();
		System.out.println("Geben sie die zweite Zahl ein");
		int Number2 = operator.nextInt();

		calc.whichOperator(Operator,Number1,Number2);
		
		System.out.println(calc.result);
	
	}

}

class calculator {
	public int result;

	public void whichOperator(String Operator, int Number1, int Number2) {

		if (Operator.equals("a")) {
			Add(Number1, Number2);

		} else if (Operator.equals("s")) {
			subtract(Number1, Number2);

		} else if (Operator.equals("m")) {
			multiply(Number1, Number2);

		} else if (Operator.equals("d")) {
			divide(Number1, Number2);

		}
	}
	
	public int Add(int Number1, int Number2) {
		result = Number1 + Number2;
		System.out.println(result);
		do {
			System.out.println("Geben sie eine Weitere Zahl ein ein");
			whichOperator(null, Number1, Number2);
			Scanner one = new Scanner(System.in);
			int Number3 = one.nextInt();
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
