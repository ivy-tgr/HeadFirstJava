package com.head.first.chap2.objects;

class Episode {
	
	int seriesNumber;
	int episodeNumber;
	
	void skipIntro() {
		System.out.println("Skipping the Intro");
	}
	
	void skipToNext() {
		System.out.println("Loading next episode");
	}

	void play() {
		System.out.println("Playing episode"+ episodeNumber);
	}
}

public class P42CompilerB {
	public static void main(String[] args) {
		Episode episode = new Episode();
		episode.seriesNumber = 4;
		episode.episodeNumber = 2;
		episode.play();
		episode.skipIntro();
		
	}
}