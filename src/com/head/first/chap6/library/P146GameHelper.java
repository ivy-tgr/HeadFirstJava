package com.head.first.chap6.library;

import java.util.*;

public class P146GameHelper {
	private static final String ALPHABET = "abcdefg";
	private static final int GRID_LENGTH = 7;
	private static final int GRID_SIZE = 49;
	private static final int MAX_ATTEMPTS = 200;
	private final int HORIZONTAL_INCREMENT = 1;
	private final int VERTICAL_INCREMENT = GRID_LENGTH;

	private final int[] grid = new int[GRID_SIZE];
	private final Random random = new Random();
	private int shipCount = 0;

	public String getUserInput(String prompt) {
		System.out.print(prompt + ":");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().toLowerCase();
	}

	public ArrayList<String> placeShip(int shipSize) {

		int[] shipCoords = new int[shipSize];
		int attempts = 0;
		boolean success = false;

		shipCount++;
		int increment = getIncrement();

		while (!success & attempts++ < MAX_ATTEMPTS) {
			int location = random.nextInt(GRID_SIZE);

			for (int i = 0; i < shipCoords.length; i++) {
				shipCoords[i] = location;
				location += increment;
			}

			if (shipFits(shipCoords, increment)) {
				success = coordsAvailable(shipCoords);
			}
		}
		savePositionToGrid(shipCoords);
		ArrayList<String> alphaCells = convertCoordsToAlphaFormat(shipCoords);
		System.out.println(alphaCells);
		return alphaCells;
	}

	private boolean shipFits(int[] shipCoords, int increment) {
		int finallocation = shipCoords[shipCoords.length - 1];
		if (increment == HORIZONTAL_INCREMENT) {
			return calcRowFromIndex(shipCoords[0]) == calcRowFromIndex(finallocation);
		} else {
			return finallocation < GRID_SIZE;
		}
	}

	private boolean coordsAvailable(int[] shipCoords) {
		for (int coord : shipCoords) {
			if (grid[coord] != 0) {
				return false; 
			}
		}
		return true;
	}

	private void savePositionToGrid(int[] shipCoords) {
		for (int index : shipCoords) {
			grid[index] = 1;
		}
	}

	private ArrayList<String> convertCoordsToAlphaFormat(int[] shipCoords) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		for (int index : shipCoords) {
			String alphaCoords = getAlphaCoordsFromIndex(index);
			alphaCells.add(alphaCoords);
		}
		return alphaCells;
	}

	private String getAlphaCoordsFromIndex(int index) {
		int row = calcRowFromIndex(index);
		int column = index % GRID_LENGTH;
		String letter = ALPHABET.substring(column, column + 1);
		return letter + row;
	}

	private int calcRowFromIndex(int index) {
		return index / GRID_LENGTH;
	}

	private int getIncrement() {
		if (shipCount % 2 == 0) {
			return HORIZONTAL_INCREMENT;
		} else {
			return VERTICAL_INCREMENT;
		}

	}
}
