package com.head.first.chap12.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class P405Jukebox2 {
	public static void main(String[] args) {
		List<Song> songs = new Songs().getSongs();
		List<String> genres = songs.stream().map(song -> song.getGenre()).distinct().collect(Collectors.toList());

		System.out.println(genres);
	}
}
