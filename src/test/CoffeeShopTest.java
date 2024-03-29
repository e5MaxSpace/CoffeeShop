package test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Customer;

public class CoffeeShopTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

	private Customer m_aCustomer = null;

	@Test
	public void testBuyCoffee() {
		m_aCustomer = new Customer();
		m_aCustomer.buy("Coffee");

		assertEquals("Coffee(22.00) | Total=22.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyPlainTea() {
		m_aCustomer = new Customer();
		m_aCustomer.buy("PlainTea");

		assertEquals("PlainTea(25.00) | Total=25.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyBeer() {
		m_aCustomer = new Customer();
		m_aCustomer.buy("Beer");

		assertEquals("Beer(18.00) | Total=18.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyCoke() {
		m_aCustomer = new Customer();
		m_aCustomer.buy("Coke");

		assertEquals("Coke(12.00) | Total=12.00", m_aCustomer.getOrder()
				.getText());
	}

	@Test
	public void testBuyCoffeeAndMilk() {
		Customer aCustomer = new Customer();
		aCustomer.buy("Coffee");
		aCustomer.buy("Milk");

		assertEquals("Coffee(22.00) + Milk(3.50) | Total=25.50", aCustomer
				.getOrder().getText());
	}

	@Test
	public void testBuyRedTeaAndHoney() {
		Customer aCustomer = new Customer();
		aCustomer.buy("RedTea");
		aCustomer.buy("Honey");

		assertEquals("RedTea(25.00) + Honey(4.50) | Total=29.50", aCustomer
				.getOrder().getText());
	}

	@Test
	public void testBuyBeerAndLemon() {
		Customer aCustomer = new Customer();
		aCustomer.buy("Beer");
		aCustomer.buy("Lemon");

		assertEquals("Beer(18.00) + Lemon(5.00) | Total=23.00", aCustomer
				.getOrder().getText());
	}

	@Test
	public void testBuyCokeAndLemon() {
		Customer aCustomer = new Customer();
		aCustomer.buy("Coke");
		aCustomer.buy("Lemon");

		assertEquals("Coke(12.00) + Lemon(5.00) | Total=17.00", aCustomer
				.getOrder().getText());
	}

	@Test
	public void testBuyCoffeeAndHoneyAndMilk() {
		Customer aCustomer = new Customer();
		aCustomer.buy("Coffee");
		aCustomer.buy("Honey");
		aCustomer.buy("Milk");

		assertEquals("Coffee(22.00) + Honey(4.50) + Milk(3.50) | Total=30.00",
				aCustomer.getOrder().getText());
	}

	@Test
	public void testBuyGreenTeaAndHoneyAndMilkAndChocolate() {
		Customer aCustomer = new Customer();
		aCustomer.buy("GreenTea");
		aCustomer.buy("Honey");
		aCustomer.buy("Milk");
		aCustomer.buy("Chocolate");

		assertEquals(
				"GreenTea(25.00) + Honey(4.50) + Milk(3.50) + Chocolate(7.00) | Total=40.00",
				aCustomer.getOrder().getText());
	}

	@Test
	public void testBuyCokeAndAllCondiment() {
		Customer aCustomer = new Customer();
		aCustomer.buy("Coke");
		aCustomer.buy("Milk");
		aCustomer.buy("Honey");
		aCustomer.buy("Lemon");
		aCustomer.buy("Chocolate");
		aCustomer.buy("Mocha");

		assertEquals(
				"Coke(12.00) + Milk(3.50) + Honey(4.50) + Lemon(5.00) + Chocolate(7.00) + Mocha(8.00) | Total=40.00",
				aCustomer.getOrder().getText());
	}
}
