package Exam02;

public class TriangleOfExam extends ShapeOfExam{

	private double high;

	public TriangleOfExam(double length,double high) {
		super(length);
		this.high=high;
	}
	public double getArea(){
		return 0.5*getLength()*high;
	}

}
