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
			System.out.println("Geben sie eine Weitere Zahl ein ");
			calc.nextCalculate(calc.result);

		} while (true);

	}

}

class calculator {
	public int result;

	public void whichOperator(String Operator, int Number1, int Number2) {

		if (Operator.equals("+")) {
			Add(Number1, Number2);

		} else if (Operator.equals("-")) {
			subtract(Number1, Number2);

		} else if (Operator.equals("*")) {
			multiply(Number1, Number2);

		} else if (Operator.equals("/") || Operator.equals(":")) {
			divide(Number1, Number2);

		} else {
			if (Operator != "+" && Operator != "-" && Operator != "*" && Operator != "/" && Operator != ":") {
				System.out.println("Geben sie ein Gültiges zeichen ein");
				nextCalculate(result);
			} else {
				System.out.println("Geben sie eine Gerade ganz zahl ein.");
				nextCalculate(result);
			}
		}

	}

	public void InputNumber() {
		Scanner operator = new Scanner(System.in);
		int Number1 = operator.nextInt();
		String Operator = operator.next();
		int Number2 = operator.nextInt();

		whichOperator(Operator, Number1, Number2);
	}

	public void nextCalculate(int result) {

		Scanner one = new Scanner(System.in);
		String Operator = one.next();
		int Number3 = one.nextInt();
		whichOperator(Operator, result, Number3);

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

}
