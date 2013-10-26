package decorator;

public class Order {

	public Order(String beverageName)
	{
		if (beverageName == "Coffee")
		{
			aBeverage = new Coffee();
		}
		if (beverageName == "PlainTea")
		{
			aBeverage = new PlainTea();
		}
		if (beverageName == "Beer")
		{
			aBeverage = new Beer();
		}
	}
	
	public String getText() {
		return aBeverage.text();
	}

	private Beverage aBeverage = null;
}
