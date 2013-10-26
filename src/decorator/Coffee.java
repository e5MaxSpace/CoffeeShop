package decorator;

public class Coffee extends Beverage {
	@Override
	public String name() {
		return "Coffee";
	}

	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 22.0;

}
