package com.head.first.chap2.objects;

class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("playing the movie");
	}
}

public class P37MovieObjects {

	public static void main(String[] args) {

		Movie one = new Movie();
		one.title = "Star-Wars";
		one.genre = "action";
		one.rating = 7;

		Movie two = new Movie();
		two.title = "The Lord of the Rings";
		two.genre = "Fantasy";
		two.rating = 10;
		two.playIt();

		Movie three = new Movie();
		three.title = "Harry Potter";
		three.genre = "Fantasy";
		three.rating = 9;
	}

}
