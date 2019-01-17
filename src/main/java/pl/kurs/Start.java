package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("kurs.xml");
		Operator operator = context.getBean("operator", Operator.class);
		operator.printData();
		operator.getCarShops().get(0).getOwner().setName("Waldek");
		operator.printData();
	}

}
