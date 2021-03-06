package pl.kurs;

import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Component
public class Operator2 extends Operator implements ApplicationContextAware {

    @Autowired
    List<CarShop> carShops;
    @Autowired
    ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @Override
    public void prepareData() {
        for (CarShop carShop : carShops) {
            for (int i = 0; i < 5; i++) {
                Car car = context.getBean("car", Car.class);
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
