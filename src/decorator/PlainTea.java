package decorator;

public class PlainTea implements Beverage {

	@Override
	public String text() {
		return "PlainTea(25.00)";
	}

	@Override
	public double cost() {
		return 25.0;
	}

}
