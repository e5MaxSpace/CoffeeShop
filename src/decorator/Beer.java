package decorator;

public class Beer implements Beverage {

	@Override
	public String text() {
		return "Beer (18.00)";
	}

	@Override
	public double cost() {
		return 18.0;
	}

}
