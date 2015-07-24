package Exam02;

public class RectangleOfExam extends ShapeOfExam{

	private double width;

	public RectangleOfExam(double length,double width) {
		super(length);
		this.width=width;
	}

	public double getArea(){
		return getLength()*width;
	}
}

