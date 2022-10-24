package com.head.first.chap2.objects;

public class P42Compiler {
	String title;
	String artist;
	int duration;
	
	void play(){
		System.out.println();
	}
	public static void main(String[] args) {
		
		P42Compiler song = new P42Compiler();
		song.artist = "The Beatles";
		song.title = "Come Thogeter";
		song.play();
		song.printDetails();
	
	}
	void printDetails() {
		System.out.println("This is "+title+"by"+ artist);
	}
	class StreamingSong{
	}
	

}
