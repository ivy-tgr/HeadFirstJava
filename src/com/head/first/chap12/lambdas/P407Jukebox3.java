package com.head.first.chap12.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class P407Jukebox3 {
	public static void main(String[] args) {
		List<Song> songs = new Songs().getSongs();	
		String songTitle = "With a Little Help from My Friends";
		List<String> result = songs.stream().filter(song -> song.getTitle().equals(songTitle))
				.map(song -> song.getArtist()).filter(artist -> !artist.equals("The Beatles"))
				.collect(Collectors.toList());

		System.out.println(result);
	}
}
