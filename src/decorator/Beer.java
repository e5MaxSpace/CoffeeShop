package decorator;

public class Beer extends Beverage {

	@Override
	public String name() {
		return "Beer";
	}

	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 18.0;

}
