package decorator;

public class Customer {

	public void buy(String string) {
		m_aOrder.add(string);
	}

	public Order getOrder() {
		return m_aOrder;
	}

	private Order m_aOrder = new Order();
}
