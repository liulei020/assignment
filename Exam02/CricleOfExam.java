package Exam02;



public class CricleOfExam extends ShapeOfExam {

	public CricleOfExam(double length) {
		super(length);
	}
	public  double get_Area(){
		return Math.PI*getLength()*getLength();
	}

}

