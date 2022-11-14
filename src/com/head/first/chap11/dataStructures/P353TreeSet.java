package com.head.first.chap11.dataStructures;

import java.util.*;

public class P353TreeSet {
	public static void main(String[] args) {
		new P353TreeSet().go();
	}

	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("finding Emo");

		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);

	}

}

class Book implements Comparable<Book> {
	private String title;

	public Book(String t) {
		title = t;
	}

	public int compareTo(Book other) {
		return title.compareTo(other.title);
	}
}