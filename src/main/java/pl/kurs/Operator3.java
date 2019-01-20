package pl.kurs;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Component
public abstract class Operator3 extends Operator {

    @Autowired
    List<CarShop> carShops;

    @Lookup
    public Car createCar() {
        return null;
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

    public void printData() {
        for (CarShop carShop : carShops) {
            System.out.println("Salon: " + carShop.getName() + " wlasciciel: " + carShop.getOwner().getName());
            for (Car car : carShop.getCars()) {
                System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
            }
        }
    }


}
