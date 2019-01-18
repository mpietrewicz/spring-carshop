package pl.kurs;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Owner {
	String name;
	String address;

    void init() {
        System.out.println("init bean'a, name " +name);
    }
}
