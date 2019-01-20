package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarShopConfiguration.class);

		Operator3 operator = context.getBean("operator3", Operator3.class);
		operator.prepareData();
		operator.printData();

	}

}
