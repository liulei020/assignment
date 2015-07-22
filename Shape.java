package Inheritance;

public class Shape {
	private String name;
	private double length;
	private String color;

	public Shape(String color){
		this.color=color;
	}
	public Shape(double length,String color){
		this.length=length;
		this.color=color;
	}
	public Shape(String name,double length,String color){
		this.name=name;
		this.length=length;
		this.color=color;
	}

	public String getName(){
		return name;	
	}

	public double getLength(){
		return length;	
	}

	public String getColor(){
		return color;
	}
}
