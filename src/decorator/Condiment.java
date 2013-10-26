package decorator;

//decorator
public abstract class Condiment extends Beverage {

	public Condiment(Beverage beverage) {
		m_aBeverage = beverage;
	}

	public String text() {
		return m_aBeverage.text() + " + " + toString();
	}

	@Override
	protected double cost() {
		return m_aBeverage.cost() + price();
	}

	protected Beverage m_aBeverage = null;
}
