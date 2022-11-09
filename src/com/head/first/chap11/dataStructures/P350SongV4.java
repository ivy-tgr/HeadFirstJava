package com.head.first.chap11.dataStructures;

class P350SongV4 implements Comparable<P350SongV4>{
	private String title;
	private String artist;
	private int bpm;

	public boolean equals(Object aSong) {
		P350SongV4 other = (P350SongV4) aSong;
		return title.equals(other.getTitle());
	}
	
	@SuppressWarnings("unused")
	private int hashcode() {
		return title.hashCode();
	}

	P350SongV4(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getBpm() {
		return bpm;
	}

	public String toString() {
		return title;
	}

	
	public int compareTo(P350SongV4 s) {
		return title.compareTo(s.getTitle());
	}
}
