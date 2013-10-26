package decorator;

public class Beer implements Beverage {

	@Override
	public String text() {
		return "Beer (18.00) | Total=18.00";
	}

}
