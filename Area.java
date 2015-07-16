package Area;

import java.lang.Math;
import java.util.Scanner;

public class Area {
	public Area(double  radius){
		double  CircleArea; 
		CircleArea= Math.PI* radius* radius;
		System.out.println("半径为"+ radius +"的圆面积为："+CircleArea);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("请输入该圆半径:");  
		int  radius = scanner.nextInt();
		new Area(radius);

	}

}
