package pl.kurs;

import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

@Setter
public abstract class Operator3 extends Operator implements ApplicationContextAware {
	List<CarShop> carShops;
	ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	@Override
	public void prepareData() {
		for (CarShop carShop : carShops) {
			for (int i = 0; i < 5; i++) {
				Car car = createCar();
				car.setPrice(1000 + i);
				carShop.addCar(car);
			}
		}
	}

	public abstract Car createCar();

	public void printData() {
		for (CarShop carShop : carShops) {
			System.out.println("Salon: " + carShop.getName() + " wlasciciel: " + carShop.getOwner().getName());
			for (Car car : carShop.getCars()) {
				System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
			}
		}
	}


}
