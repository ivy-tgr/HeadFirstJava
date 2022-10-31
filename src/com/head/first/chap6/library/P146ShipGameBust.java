package com.head.first.chap6.library;

import java.util.ArrayList;

public class P146ShipGameBust {

	private P146GameHelper helper = new P146GameHelper();
	private ArrayList<P146ShipGame> ShipGames = new ArrayList<P146ShipGame>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		P146ShipGame one = new P146ShipGame();
		one.setName("Adria");
		P146ShipGame two = new P146ShipGame();
		two.setName("Cabista");
		P146ShipGame three = new P146ShipGame();
		three.setName("Poniez");
		ShipGames.add(one);
		ShipGames.add(two);
		ShipGames.add(three);

		System.out.println("Your goal is to sink three ships ");
		System.out.println("Adria, Canista and Poniez");
		System.out.println("Try to sink them all in the fewest number of guesses");

		for (P146ShipGame p146ShipGame : ShipGames) {
			ArrayList<String> newLocation = helper.placeShip(3);
			p146ShipGame.setLocationCells(newLocation);

		}
	}


	private void startPlaying() {
		while (!ShipGames.isEmpty()) {
			String userGuesses = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuesses);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (P146ShipGame shipGameToTest : ShipGames) {
			result = shipGameToTest.checkYourself(userGuess);

			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				ShipGames.remove(shipGameToTest);
				break;
			}

		}
		System.out.println(result);
	}

	private void finishGame() {
		System.out.println("all ships are destroyed");
		if (numOfGuesses <= 18) {
			System.out.println("it took you only " + numOfGuesses + "guesses");

		} else {
			System.out.println("Took you long enough. " + numOfGuesses + "guesses");
		}

	}

	public static void main(String[] args) {
		P146ShipGameBust game = new P146ShipGameBust();
		game.setUpGame();
		game.startPlaying();
	}

}
