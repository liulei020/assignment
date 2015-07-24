package Exam02;

import java.awt.Shape;
import java.util.ArrayList;

public class TestOfExam {
	static ArrayList<Object> shapes;
	public static void main(String[] args) {
		shapes = new ArrayList<Object>();
		shapes.add(new RectangleOfExam(20, 10));
		shapes.add(new SquareOfExam(20));
		shapes.add(new CricleOfExam(10));
		shapes.add(new TriangleOfExam(20, 10));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
}

