package Exam02;

import java.util.ArrayList;

public class TestOfExam {

	static ArrayList<ShapeOfExam> shapes;
	static double sum;
	public static double getTotalArea(ArrayList<ShapeOfExam> shapes){
		for(int i=0;i<shapes.size();i++){
			sum+=shapes.get(i).getArea();
		}
		return sum;
	}
	public static void main(String[] args) {
		shapes = new ArrayList<ShapeOfExam>();
		//System.out.println(new RectangleOfExam(20, 10).getArea());
		shapes.add(new RectangleOfExam(20, 10));
		//System.out.println(new SquareOfExam(20).getArea());
		shapes.add(new SquareOfExam(20));
		//System.out.println(new CricleOfExam(10).getArea());
		shapes.add(new CricleOfExam(10));
		//System.out.println(new TriangleOfExam(20, 10).getArea());
		shapes.add(new TriangleOfExam(20, 10));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}

}

