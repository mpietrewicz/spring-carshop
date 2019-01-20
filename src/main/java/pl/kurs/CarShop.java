package pl.kurs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Component
public class CarShop {
	@Autowired
	private Owner owner;

	private String name;
	private List<Car> cars = new ArrayList<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}
}
