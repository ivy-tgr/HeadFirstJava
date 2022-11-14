package com.head.first.chap12.lambdas;

import java.util.List;

public class P394Lambda {
	public static void main(String[] args) {
		List<String> allColors = List.of("Red", "Blue", "Yellow");
		for (String color : allColors) {
			System.out.println(color);
		}

		allColors.forEach(Color -> System.out.println(Color));

	}
}
