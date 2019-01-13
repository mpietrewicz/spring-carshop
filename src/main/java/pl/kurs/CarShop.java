package pl.kurs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class CarShop {
	private String name;
	private Owner owner;
	private List<Car> cars = new ArrayList<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}
}
