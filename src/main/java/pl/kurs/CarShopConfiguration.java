package pl.kurs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="pl.kurs")
public class CarShopConfiguration {

    @Bean
    public Operator operator() {
        return new Operator();
    }

}
