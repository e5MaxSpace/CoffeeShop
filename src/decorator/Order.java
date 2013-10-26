package decorator;

import java.text.DecimalFormat;

public class Order {

	public Order() {
	}

	public String getText() {
		String text = m_aBeverage.text();
		text += " | Total=";
		// TODO: 数字的格式化和另一处存在重复，是否有重构至一个工具函数的必要？
		text += new DecimalFormat("#.00").format(m_aBeverage.cost());

		return text;
	}

	public void add(String string) {
		// TODO: 将该函数重构至工厂方法
		if (string == "Coffee") {
			m_aBeverage = new Coffee();
		}
		if (string == "PlainTea") {
			m_aBeverage = new Tea("PlainTea");
		}
		if (string == "RedTea") {
			m_aBeverage = new Tea("RedTea");
		}
		if (string == "GreenTea") {
			m_aBeverage = new Tea("GreenTea");
		}
		if (string == "Beer") {
			m_aBeverage = new Beer();
		}
		if (string == "Coke") {
			m_aBeverage = new Coke();
		}

		if (string == "Milk") {
			m_aBeverage = new Milk(m_aBeverage);
		}
		if (string == "Honey") {
			m_aBeverage = new Honey(m_aBeverage);
		}
		if (string == "Lemon") {
			m_aBeverage = new Lemon(m_aBeverage);
		}
		if (string == "Chocolate") {
			m_aBeverage = new Chocolate(m_aBeverage);
		}
		if (string == "Mocha") {
			m_aBeverage = new Mocha(m_aBeverage);
		}
	}

	private Beverage m_aBeverage = null;
}
