package decorator;

public class Chocolate extends Condiment {

	public Chocolate(Beverage beverage) {
		super(beverage);
	}

	@Override
	String name() {
		return "Chocolate";
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 7.0;
}
