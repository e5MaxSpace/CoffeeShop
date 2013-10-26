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

}
