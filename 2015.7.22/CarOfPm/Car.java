package Polymorphism;

public class Car {

	private String name;
	private double price;

	public Car(double price){
		this.price=price;
	}
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
}