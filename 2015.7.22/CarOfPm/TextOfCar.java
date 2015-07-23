package Polymorphism;

public class TextOfCar {

	public static void main(String[] args) {
		CarShop shop=new CarShop();
		shop.sellCar(new QQ(50000));
		shop.sellCar(new BMW("BMW3s",500000));
		System.out.println("Sale income: "+ shop.getMoney());

	}

}
