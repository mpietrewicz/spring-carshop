package pl.kurs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class CarShop {

	public CarShop() {
		owner = new Owner();
		owner.setName("Adam Kowalski");
	}

	private String name = "Salon nr 1";
	private Owner owner;
	private List<Car> cars = new ArrayList<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}
}
