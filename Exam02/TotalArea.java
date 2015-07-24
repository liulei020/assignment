package Exam02;

import java.util.ArrayList;

public class TotalArea{

	double sum=0;

	public void getTotalArea(ArrayList<Object> shapes){
		for(int i=0;i<shapes.size();i++){
			sum+=shapes.get(i).getArea();
		}
	}
}
