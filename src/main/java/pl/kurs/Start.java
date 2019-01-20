package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarShopConfiguration.class);

		Operator2 operator = context.getBean("operator2", Operator2.class);
		operator.prepareData();
		operator.printData();

	}

}
