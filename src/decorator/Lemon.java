package decorator;

public class Lemon extends Condiment {

	public Lemon(Beverage beverage) {
		super(beverage);
	}

	@Override
	String name() {
		return "Lemon";
	}

	@Override
	double price() {
		return PRICE;
	}

	static double PRICE = 5.0;
}
