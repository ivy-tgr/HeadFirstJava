package com.head.first.chap12.lambdas;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P408Jukebox4 {

	public static void main(String[] args) {
		List<Song> songs = new Songs().getSongs();
		Set<String> genres = songs.stream().map(Song :: getGenre).collect(Collectors.toSet());

		System.out.println(genres);
	}
}
