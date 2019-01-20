package pl.kurs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Operator {
	List<CarShop> carShops;

	public void prepareData() {
		for (CarShop carShop : carShops) {
			for (int i = 0; i < 5; i++) {
				Car car = new Car();
				car.setMake("BMW");
				car.setModel("seria " + (i+1));
				car.setPrice(1000 + i);
				carShop.addCar(car);
			}
		}
	}

	public void printData() {
		for (CarShop carShop : carShops) {
			System.out.println("Salon: " + carShop.getName() + " wlasciciel: " + carShop.getOwner().getName());
			for (Car car : carShop.getCars()) {
				System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
			}
		}
	}

}
