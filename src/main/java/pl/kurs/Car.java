package pl.kurs;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Car {
	String make;
	String model;
	double price;

	public static Car createInstance() { //factory method
		Car car = new Car();
		car.setMake("TESLA");
		return car;
	}

}
