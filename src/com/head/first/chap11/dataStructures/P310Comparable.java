package com.head.first.chap11.dataStructures;

import java.util.*;

public class P310Comparable {

	public static void main(String[] args) {
		new P310Comparable().go();
	}

	public void go() {
		List<String> songList = MockSongs1.getSongStrings();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);

	}
}

class MockSongs1 {
	public static List<String> getSongStrings() {
		List<String> songs = new ArrayList<>();
		songs.add("somersault");
		songs.add("cassidy");
		songs.add("$10");
		songs.add("havana");
		songs.add("Cassidy");
		songs.add("50 Ways");
		return songs;

	}
}