package Area;

import java.lang.Math;
import java.util.Scanner;

public class Area {
	public Area(double  radius){
		double  CircleArea; 
		CircleArea= Math.PI* radius* radius;
		System.out.println("�뾶Ϊ"+ radius +"��Բ���Ϊ��"+CircleArea);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("�������Բ�뾶:");  
		int  radius = scanner.nextInt();
		new Area(radius);

	}

}
