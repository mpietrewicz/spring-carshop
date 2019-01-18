package pl.kurs.Wzorce;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dziecko extends Rodzic{

    String imie;
    String nazwisko;

    public String getNazwiskoRodzica() {
        return super.nazwisko;
    }

}
