package com.head.first.chap9.constructing;

class P269PopularObjects {

}

class Bees {
	Honey[] beeHoney;
}

class Racoon {
	Kit rk;
	Honey rh;
}

class Kit {
	Honey honey;
}

class Bear {
	Honey hunny;
}

class Honey {
	public static void main(String[] args) {
		Honey honeyPot = new Honey();
		Honey[] ha = { honeyPot, honeyPot, honeyPot, honeyPot, };
		Bees bees = new Bees();
		bees.beeHoney = ha;
		Bear[] bears = new Bear[5];
		for (int i = 0; i < 5; i++) {
			bears[i] = new Bear();
			bears[i].hunny = honeyPot;

		}
		Kit kit = new Kit();
		kit.honey = honeyPot;
		Racoon racoon = new Racoon();

		racoon.rh = honeyPot;
		racoon.rk = kit;
		kit = null;
		System.out.println(ha);

	}
}
