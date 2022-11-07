package com.head.first.chap7.polymorphism;

public class P171Inheritance {
	boolean worksAtHospital;
	void treatPatient() {
		//perform a checkup
	}
}
class FamilyDoctor extends P171Inheritance{
	boolean makesHouseCalls;
	
	void giveAdvice() {
		// give homespun advice
	}
	
}

class Surgeon extends P171Inheritance {
	void treatPatient () {
		// perform surgery
	}
	void makeIncision() {
		//make incision 
	}
}
