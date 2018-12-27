package pl.kurs;

public class Start {

	public static void main(String[] args) {
		CarShop carShop = new CarShop();
		carShop.setName("Salon BMW");
		Operator operator = new Operator();
		operator.setCarShop(carShop);
		operator.prepareData();
		operator.printData();
	}

}
