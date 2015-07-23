package Polymorphism;

public class TextOfPm {

	public static void main(String[] args) {

		ShapeOfPm r=new RectangleOfPm(20,10,"black");
		System.out.println("The length of rectangle ��"+r.getLength());
		System.out.println("The width of rectangle ��"+r.getWidth());
		System.out.println("The color of shape ��"+r.getColor());
		System.out.println("The Area of rectangle ��"+r.CalculateArea()+"\n");

		ShapeOfPm c=new CircleOfPm(10,"black");
		System.out.println("The radius of circle ��"+c.getRadius());
		System.out.println("The color of circle ��"+c.getColor());
		System.out.println("The Area of circle ��"+c.CalculateArea());

	}
}
