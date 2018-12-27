package pl.kurs;

public class Car {
	String make;
	String model;
	double price;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void testCar() {
		System.out.println("Testowanie samochodu");
	}

}
