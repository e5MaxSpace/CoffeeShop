package decorator;

public class Coke implements Beverage {

	@Override
	public String text() {
		return "Coke (12.00)";
	}

	@Override
	public double cost() {
		return 12.0;
	}

}
