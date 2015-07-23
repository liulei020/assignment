package Polymorphism;

public class ShapeOfPm {

	private String color;
	private double length;

	public ShapeOfPm(String color) {
		this.color=color;
	}
	public double getLength(){
		return length;
	}
	public String getColor(){
		return color;
	}
	public double getWidth(){
		return 0;
	}
	public double getRadius(){
		return 0;
	}
	public  double CalculateArea(){
		return 0;
	}
}
