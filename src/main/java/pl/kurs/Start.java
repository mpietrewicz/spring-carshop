package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("kurs.xml");
		Operator operator = context.getBean("operator3", Operator.class);
		operator.prepareData();
		operator.printData();
	}

}
