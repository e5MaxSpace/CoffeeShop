package decorator;

public class Customer {

	public Customer() {
		m_aOrder = new Order();
	}

	public void buy(String string) {
		m_aOrder.add(string);
	}

	public Order getOrder() {
		return m_aOrder;
	}

	private Order m_aOrder = null;
}
