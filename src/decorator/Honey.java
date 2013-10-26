package decorator;

public class Honey extends Condiment {

	public Honey(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String name() {
		return "Honey";
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 4.5;
}
