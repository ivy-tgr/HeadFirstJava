package com.head.first.chap9.constructing;

import java.util.ArrayList;

public class P270Mystery {
	public static void main(String[] args) {
		ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
		// V2Radiator v2 = new V2Radiator(aList);
		// V3Radiator v3 = new V3Radiator(aList);

		for (int z = 0; z < 20; z++) {
			RetentionBot ret = new RetentionBot(aList);
		}
	}
}

class V2Radiator {
	V2Radiator(ArrayList<SimUnit> list) {
		for (int x = 0; x < 5; x++) {
			list.add(new SimUnit("V2Radiator"));
		}
	}

}

class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList<SimUnit> lglist) {
		super(lglist);
		for (int g = 0; g < 10; g++) {
			lglist.add(new SimUnit("Retention"));
		}
	}
}

class SimUnit {
	String botType;

	SimUnit(String type) {
		botType = type;
	}

	int powerUse() {
		if ("Retention".equals(botType)) {

			return 2;
		} else {
			return 4;
		}
	}
}

class RetentionBot {
	RetentionBot(ArrayList<SimUnit> rlist) {
		rlist.add(new SimUnit("Retention"));
	}
}
