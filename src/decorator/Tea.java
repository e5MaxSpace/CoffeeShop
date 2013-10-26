package decorator;

public class Tea extends Beverage {

	public Tea(String name) {
		m_name = name;
	}

	@Override
	public String name() {
		return m_name;
	}

	@Override
	public double cost() {
		return PRICE;
	}

	@Override
	double price() {
		return PRICE;
	}

	private String m_name;

	private static double PRICE = 25.0;
}
