package decorator;

import java.text.DecimalFormat;

public abstract class Beverage {
	public String text() {
		return toString();
	}

	public String toString() {
		return name() + "(" + new DecimalFormat("#.00").format(price()) + ")";
	}

	abstract String name();

	abstract double price();

	abstract double cost();
}
