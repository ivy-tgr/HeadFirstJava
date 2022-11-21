package com.head.first.chap11.dataStructures;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		calculator calc = new calculator();

		System.out.println("Wilkommen beim Taschenrechener");

		System.out.println("Geben sie Ihre Rechnung ein");

		calc.InputNumber();

		do {
			System.out.println(calc.result);
			Scanner two = new Scanner(System.in);

			try {
				String Operator = two.next();

				if (Operator.equals("e")) {
					System.out.println("Vielen Dank für das Benutzen des Rechners");
					break;

				} else {
					int Number3 = two.nextInt();
					calc.whichOperator(Operator, calc.result, Number3);
				}

			} catch (Exception e) {
				System.out.println("Geben sie eine Gültige Zahl ein");
				
			}

		} while (true);

	}

}

class calculator {
	public int result;
	Scanner one = new Scanner(System.in);

	public void whichOperator(String Operator, int Number1, int Number2) {

		if (Operator.equals("+")) {
			Add(Number1, Number2);

		} else if (Operator.equals("-")) {
			subtract(Number1, Number2);

		} else if (Operator.equals("*")) {
			multiply(Number1, Number2);

		} else if (Operator.equals("/") || Operator.equals(":")) {
			divide(Number1, Number2);

		} else if (Operator.equals("%")) {
			percent(Number1, Number2);

		} else {
			System.out.println("Geben sie ein Gültiges zeichen ein");

		}

	}

	public void InputNumber() {
		int Number1 = 0;
		int Number2 = 0;
		try {
			Number1 = one.nextInt();
			String Operator = one.next();
			Number2 = one.nextInt();
			whichOperator(Operator, Number1, Number2);
		} catch (Exception e) {
			System.out.println("Geben sie eine Gültige Zahl ein");
			InputNumber();
		}

	}

	public int Add(int Number1, int Number2) {
		result = Number1 + Number2;
		return result;

	}

	public int subtract(int Number1, int Number2) {
		result = Number1 - Number2;
		return result;
	}

	public int multiply(int Number1, int Number2) {
		result = Number1 * Number2;
		return result;
	}

	public int divide(int Number1, int Number2) {
		result = Number1 / Number2;
		return result;

	}

	public int percent(int Number1, int Number2) {
		result = Number2 / 100 * Number1;
		return result;
	}

}
