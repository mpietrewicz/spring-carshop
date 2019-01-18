package pl.kurs;

public class PrintableFactory {

    public static Printable getPrintable() {
        return new SuperCar();
    }

}
