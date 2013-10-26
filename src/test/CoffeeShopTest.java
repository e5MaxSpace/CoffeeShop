package test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.Customer;
import decorator.Order;

public class CoffeeShopTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
	}
	
	@Test
	public void testBuyCoffee()
	{
		Customer aCustomer = new Customer();
		Order aOrder = aCustomer.buy("Coffee");
		
		assertEquals("Coffee (22.00) | Total=22.00", aOrder.getText());
	}

	@Test
	public void testBuyPlainTea()
	{
		Customer aCustomer = new Customer();
		Order aOrder = aCustomer.buy("PlainTea");
		
		assertEquals("PlainTea(25.00) | Total=25.00", aOrder.getText());
	}
	
	@Test
	public void testBuyBeer()
	{
		Customer aCustomer = new Customer();
		Order aOrder = aCustomer.buy("Beer");
		
		assertEquals("Beer (18.00) | Total=18.00", aOrder.getText());
	}
	
	@Test
	public void testBuyCoke()
	{
		Customer aCustomer = new Customer();
		Order aOrder = aCustomer.buy("Coke");
		
		assertEquals("Coke (12.00) | Total=12.00", aOrder.getText());
	}
}
