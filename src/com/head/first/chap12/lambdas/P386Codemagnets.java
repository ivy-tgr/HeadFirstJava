package com.head.first.chap12.lambdas;

import java.util.*;
import java.util.stream.*;

public class P386Codemagnets {
	public static void main(String[] args) {
		List<String> coffees = List.of("Cappuccino", "Americano", "Espresso", "Cortado", "Mocha", "Cappuccino",
				"Flat White", "Latte");

		List<String> cooffeesEndingInO = coffees.stream().sorted().distinct().limit(3).filter(s -> s.endsWith("o"))
				.collect(Collectors.toList());

		System.out.println(cooffeesEndingInO);

	}
}
