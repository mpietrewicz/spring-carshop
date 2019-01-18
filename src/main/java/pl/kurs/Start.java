package pl.kurs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.kurs.Wzorce.Dziecko;
import pl.kurs.Wzorce.Rodzic;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("kurs.xml");

		System.out.println("   ---   ");
		System.out.println("context.containsBean Test: " +context.containsBean("Test"));
		System.out.println("context.getType: " +context.getType("car"));
		System.out.println("context.isPrototype: " +context.isPrototype("car"));
		System.out.println("   ---   ");

		Operator operator = context.getBean("operator3", Operator.class);
		operator.prepareData();
		operator.printData();

		System.out.println("-- WZORCE ---");
		Rodzic rodzic = context.getBean("rodzic", Rodzic.class);
		System.out.println(rodzic.getNazwisko());
		Dziecko dziecko = context.getBean("dziecko", Dziecko.class);
		System.out.println(dziecko.getNazwisko());
		System.out.println(dziecko.getNazwiskoRodzica());

	}

}
