package pl.kurs;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="pl.kurs")
@PropertySource("app.properties")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class CarShopConfiguration {

    @Bean
    public Operator operator() {
        return new Operator();
    }

    @Bean @Scope("prototype")
    public Car car(@Value("${car.make}") String make, @Value("${car.model}") String model) {
        Car car = new Car();
        car.setMake(make);
        car.setModel("A3");
        return car;
    }

}
