package com.head.first.chap6.library;

import java.util.ArrayList;

public class P133ArrayList {
	public static void main(String[] args) {
		ArrayList<P133ArrayList> myList = new ArrayList<P133ArrayList>();

		P133ArrayList egg1 = new P133ArrayList();
		myList.add(egg1);

		P133ArrayList egg2 = new P133ArrayList();
		myList.add(egg2);

		int theSize = myList.size();
		System.out.println(theSize);

		boolean isIn = myList.contains(egg1);
		System.out.println(isIn);
		
		int idx = myList.indexOf(egg2);
		System.out.println(idx);
		
		boolean empty = myList.isEmpty();
		System.out.println(empty);
		
		myList.remove(egg1);
		System.out.println(theSize);
	}
}

