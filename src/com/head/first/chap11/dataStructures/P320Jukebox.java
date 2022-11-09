package com.head.first.chap11.dataStructures;

import java.util.*;

public class P320Jukebox {
	public static void main(String[] args) {
		new P320Jukebox().go();
	}

	public void go() {
		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println(songList);

		Collections.sort(songList);
		System.out.println(songList);
	}
}


