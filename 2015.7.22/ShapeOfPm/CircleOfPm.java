package Polymorphism;

public class CircleOfPm extends ShapeOfPm {

	private double radius;

	public CircleOfPm(double radius, String color) {
		super(color);
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public  double CalculateArea(){
		return Math.PI*radius*radius;
	}

}
