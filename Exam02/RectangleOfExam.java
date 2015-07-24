package Exam02;

public class RectangleOfExam extends ShapeOfExam{

	private double width;

	private double length;

	public RectangleOfExam(double length,double width) {
		super(length);
		this.width=width;
	}
	public RectangleOfExam(double length) {
		super(length);
		this.width=length;
	}
	public double getArea(){
		return length*width;
	}
}

