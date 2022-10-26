package com.head.first.chap4.methods;

public class P90Calculation {
	int counter = 0;

	public static void main(String[] args) {
		int count = 0;
		P90Calculation[] mixes = new P90Calculation[20];
		int i = 0;
		while (i < 19) {       
			mixes[i] = new P90Calculation();
			mixes[i].counter = mixes[i].counter + 1;
			count = count + 1;
			count = count + mixes[i].maybeNew(i);
			i = i + 1;
		}
		System.out.println(count + " " + mixes[1].counter);
	}

	public int maybeNew(int index) {
		if (index < 1) {
			P90Calculation mix = new P90Calculation();
			mix.counter = mix.counter + 1;
			return 1;
		}
		return 0;
	}
}
