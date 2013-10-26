package test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Customer;

public class CoffeeShopTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	private Customer m_aCustomer = new Customer();

	@Test
	public void testBuyCoffee() {
		m_aCustomer.buy("Coffee");

		assertEquals("Coffee (22.00) | Total=22.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyPlainTea() {
		m_aCustomer.buy("PlainTea");

		assertEquals("PlainTea(25.00) | Total=25.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyBeer() {
		m_aCustomer.buy("Beer");

		assertEquals("Beer (18.00) | Total=18.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyCoke() {
		m_aCustomer.buy("Coke");

		assertEquals("Coke (12.00) | Total=12.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyCoffeeAndMilk() {
		m_aCustomer.buy("Coffee");
		m_aCustomer.buy("Milk");

		assertEquals("Coffee (22.00) + Milk (3.50) | Total=25.50", m_aCustomer
				.getOrder().getText());
	}
}
