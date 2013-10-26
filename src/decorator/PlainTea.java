package decorator;

public class PlainTea implements Beverage {

	@Override
	public String text() {
		return "PlainTea(25.00) | Total=25.00";
	}

}
