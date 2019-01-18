package pl.kurs;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Owner {
	String name;
	String address;

    public Owner() {
        this.name = "Nazwa z konstruktora";
    }

    void init() {
        System.out.println("init bean'a, name " +name);
    }
}
