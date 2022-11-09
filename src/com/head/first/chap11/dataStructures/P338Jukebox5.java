package com.head.first.chap11.dataStructures;

import java.util.*;


public class P338Jukebox5 {
	public static void main(String[] args) {
		new P338Jukebox5().go();
	}
	public void go() {
		List<SongV3> songList = MockSongs.getSongsV3();
	
		TitleCompare titleCompare = new TitleCompare();
		songList.sort(titleCompare);
		System.out.println(songList);
	}
}

class TitleCompare implements  Comparator<SongV3> {
	public int compare (SongV3 one, SongV3 two) {
		return one.getTitle().compareTo(two.getTitle());
	}
} 