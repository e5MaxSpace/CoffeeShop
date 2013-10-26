package decorator;

public class Coffee implements Beverage {

	@Override
	public String text() {
		return "Coffee (22.00)";
	}

	@Override
	public double cost() {
		return 22.0;
	}

}
