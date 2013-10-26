package decorator;

public class Mocha extends Condiment {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	String name() {
		return "Mocha";
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 8.0;

}
