package decorator;

public class Milk implements Beverage {

	public Milk(Beverage beverage) {
		m_aBeverage = beverage;
	}

	@Override
	public String text() {
		return m_aBeverage.text() + " + Milk (3.50)";
	}

	private Beverage m_aBeverage;

	@Override
	public double cost() {
		return m_aBeverage.cost() + 3.5;
	}
}
