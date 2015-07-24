package Exam02;

public class SquareOfExam extends ShapeOfExam {

	public SquareOfExam(double len) {
		super(len);
	}
	public double getArea(){
		return getLength()*getLength();
	}

}
