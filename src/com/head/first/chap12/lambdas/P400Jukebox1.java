package com.head.first.chap12.lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class P400Jukebox1 {

	public static void main(String[] args) {
		List<Song> songs = new Songs().getSongs();
		// System.out.println(songs);
		List<Song> rocksongs = songs.stream()
				.filter(song -> song.getGenre()
						.equals("Rock"))
				.collect(Collectors.toList());

		System.out.println(rocksongs);
	}

}


