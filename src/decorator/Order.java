package decorator;

import java.text.DecimalFormat;

public class Order {

	public Order() {
	}

	public String getText() {
		String text = aBeverage.text();
		text += " | Total=" + new DecimalFormat("#.00").format(aBeverage.cost());

		return text;
	}

	private Beverage aBeverage = null;

	public void add(String string) {
		if (string == "Coffee") {
			aBeverage = new Coffee();
		}
		if (string == "PlainTea") {
			aBeverage = new PlainTea();
		}
		if (string == "Beer") {
			aBeverage = new Beer();
		}
		if (string == "Coke") {
			aBeverage = new Coke();
		}
		if (string == "Milk") {
			aBeverage = new Milk(aBeverage);
		}
	}
}
