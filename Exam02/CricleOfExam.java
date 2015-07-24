package Exam02;



public class CricleOfExam extends ShapeOfExam {

	public CricleOfExam(double length) {
		super(length);
	}

	public double getArea() {
		return Math.PI*getLength()*getLength();
	}

}

