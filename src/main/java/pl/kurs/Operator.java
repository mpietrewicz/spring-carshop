package pl.kurs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter @Setter
public class Operator {

	@Autowired
	List<CarShop> carShops;

	public void prepareData(String make, int ile, double cena) {
		for(CarShop carShop:carShops) {
			for(int i=0; i<ile; i++) {
				Car car = new Car();
				car.setMake(make);
				car.setModel(make+i);
				car.setPrice(cena+i);
				carShop.addCar(car);
			}
		}
	}

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
