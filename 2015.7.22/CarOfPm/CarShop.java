package Polymorphism;

public class CarShop {
	int money=0;
	public void sellCar(Car c){
		System.out.println("The price of this car :"+c.getPrice());
		money+=c.getPrice();
	}
	public int getMoney(){
		return money;	
	}

}
