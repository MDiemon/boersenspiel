package controller;

public class EndOfDay {

	public static void endDay() {
		// TODO
		// double rate = generateRate();
		// Stock.setRate(rate);
		// Stock.setCost(Stock.getCost * rate);

		// User.setBalance(User.getBalance - TÄGL.KOSTEN)

	}

	public static double generateRate() {
		// TODO - In die Doku:
		// Quote zufällig generieren
		// 0-2% zu 60%
		// 2-5% zu 25%
		// 5-10% zu 10%
		// 10-15% zu 5%

		int chance = (int) (Math.random() * 100);
		double rate = 0;

		if (chance <= 60)
			rate = getRandom(0, 2);
		else if (chance > 60 && chance <= 85)
			rate = getRandom(2, 5);
		else if (chance > 85 && chance <= 95)
			rate = getRandom(5, 10);
		else if (chance > 95)
			rate = getRandom(10, 15);

		return Math.round(rate * 100) / 100;
	}

	public static double getRandom(double low, double high) {
		return Math.random() * (high - low) + low;
	}
}
