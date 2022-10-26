package com.head.first.chap3.Variables;

public class P63CompilerB {
	
	public static void main(String[] args) {
		
		Hobbits[] h = new Hobbits[3];
		int z = 0;

		while (z < 3) {

			h[z] = new Hobbits();

			h[z].name = "Bilbo";

			if (z == 1) {
				h[z].name = "Sam";
			}

			if (z == 2) {
				h[z].name = "Frodo";
			}

			System.out.print(h[z].name + " is a nice Hobbit ");
			
			z = z + 1;
		}
	}
}

class Hobbits {
	String name;

}