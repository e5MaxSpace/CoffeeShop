package decorator;

//decorator
public abstract class Condiment extends Beverage {

	public Condiment(Beverage beverage) {
		m_aBeverage = beverage;
	}

	public String text() {
		return m_aBeverage.text() + " + " + toString();
	}

	protected Beverage m_aBeverage = null;
}
