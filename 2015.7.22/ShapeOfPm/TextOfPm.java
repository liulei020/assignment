package Polymorphism;

public class TextOfPm {

	public static void main(String[] args) {

		ShapeOfPm r=new RectangleOfPm(20,10,"black");
		System.out.println("The length of rectangle £º"+r.getLength());
		System.out.println("The width of rectangle £º"+r.getWidth());
		System.out.println("The color of shape £º"+r.getColor());
		System.out.println("The Area of rectangle £º"+r.CalculateArea()+"\n");

		ShapeOfPm c=new CircleOfPm(10,"black");
		System.out.println("The radius of circle £º"+c.getRadius());
		System.out.println("The color of circle £º"+c.getColor());
		System.out.println("The Area of circle £º"+c.CalculateArea());

	}
}
