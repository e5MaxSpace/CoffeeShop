package decorator;

public class Coke extends Beverage {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 12.0;
}
