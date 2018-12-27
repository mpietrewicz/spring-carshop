package pl.kurs;

public class Operator {

	CarShop carShop;

	public void prepareData() {
		carShop = new CarShop();
		for (int i = 0; i < 5; i++) {
			Car car = new Car();
			car.setMake("Fiat");
			car.setModel("Panda" + i);
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
