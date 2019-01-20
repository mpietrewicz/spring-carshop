package pl.kurs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Owner {
	String name;
	String address;

    public Owner() {
        this.name = "Marek Marek";
    }

    void init() {
        System.out.println("init bean'a, name " +name);
    }
}
