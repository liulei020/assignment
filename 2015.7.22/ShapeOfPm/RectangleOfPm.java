package Polymorphism;

public class RectangleOfPm extends ShapeOfPm{

	private double length;
	private double width;

	public RectangleOfPm(double length,double width,String color) {
		super(color);
		this.length=length;
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public  double CalculateArea(){
		return length*width;
	}

}
