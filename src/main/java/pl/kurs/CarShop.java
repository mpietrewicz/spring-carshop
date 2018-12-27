package pl.kurs;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

	public CarShop() {
		owner = new Owner();
		owner.setName("Adam Kowalski");
	}

	private String name = "Salon nr 1";
	private Owner owner;
	private List<Car> cars = new ArrayList<Car>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}
}
