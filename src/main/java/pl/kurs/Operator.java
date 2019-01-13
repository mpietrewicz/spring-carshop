package pl.kurs;

import lombok.Setter;

@Setter
public class Operator {
	CarShop carShop;

	public void prepareData() {
		for (int i = 0; i < 5; i++) {
			Car car = new Car();
			car.setMake("BMW");
			car.setModel("seria " + (i+1));
			car.setPrice(1000 + i);
			carShop.addCar(car);
		}
	}

	public void printData() {
		System.out.println("Salon: " + carShop.getName() + " wlasciciel: " + carShop.getOwner().getName());
		for (Car car : carShop.getCars()) {
			System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
		}
	}

}
