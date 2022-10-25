package com.head.first.chap3.Variables;

public class Summary {

	String name;
	double price;
	String device;

	public static void main(String[] args) {
		Summary game[] = new Summary[5];

		int x = 0;
		int y = 0;

		while (x < 4) {

			game[x] = new Summary();

			game[x].name = "Minecraft";
			game[x].price = 23D;

			if (x == 3) {
				game[x].name = "Car Race";
				game[x].price = 16D;
				game[x].play();

			}
			x = x + 1;

		}

		game[1].name = "Clash of Clans";
		game[1].price = 0D;
		game[1].device = "Handy";

		game[2].name = "HayDay";
		game[2].price = 12D;
		game[2].device = "Tablet";
		game[2].play();

		while (y < 4) {

			System.out.println(game[y].name + " kostet " + game[y].price + "Fr");
			y = y + 1;

		}

	}

	void play() {
		System.out.println(name + " is loading");
	}

}
