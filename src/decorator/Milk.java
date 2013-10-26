package decorator;

public class Milk extends Condiment {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String name() {
		return "Milk";
	}

	@Override
	public double cost() {
		return m_aBeverage.cost() + PRICE;
	}

	@Override
	double price() {
		return PRICE;
	}

	private static double PRICE = 3.5;
}
