package pl.kurs;

public class PrintableFactory {

    public Printable getPrintable() {
        return new SuperCar();
    }

}
