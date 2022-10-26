
package com.head.first.chap5.program;

class P103ShipGameSimple {

	public static void main(String[] args) {
		while (true) {

			int numOfGuesses = 0;

			GameHelper helper = new GameHelper();

			P103ShipGameSimple theGame = new P103ShipGameSimple();
			int randomNum = (int) (Math.random() * 7);

			int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
			theGame.setLocationCells(locations);
			boolean isAlive = true;

			while (isAlive) {
				int guess = helper.getUserInput("enter a number");
				String result = theGame.checkYourself(guess);
				numOfGuesses++;
				if (result.equals("kill")) {
					isAlive = false;
					System.out.println("You took " + numOfGuesses + " guesses");
				}
			}

			int again = helper.getUserInput("Play again? enter 1");
			theGame.playAgain(again);
			if (again != 1) {
				break;
			}

		}

	}

	private int[] locationCells;
	private int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String playAgain(int again) {
		String answer = "next Game";
		if (again != 1) {
			System.out.println("Thanks for playing");

		} else {
			System.out.println("next game");
		}
		return answer;

	}

	public String checkYourself(int guess) {
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}

		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

}
