package Inheritance;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double len,String color){
		super(color);
		this.length=len;
		this.width=len;
	}
	public Rectangle(double lentgth,double width,String color){
		super(color);
		this.length=lentgth;
		this.width=width;
	}

	public double getLength(){
		return length;	
	}

	public double getWidth(){
		return width;	
	}
	public double get_Area(){
		double area=0;
		area=this.length*this.width;
		return area;
	}
	public void printInfo(){
		System.out.println(this.getLength());
		System.out.println(this.getWidth());
		System.out.println(this.getColor());
		System.out.println(this.get_Area());
	}
}

