package LeapYear;

import java.util.Scanner;

public class LeapYear{
	public static int year;
	public static boolean isLeap(){
		if(year%100==0){
			if(year%400==0){
				return true;
			}else{
				return false;
			}
		}else{
			if(year%4==0){
				return true;
			}else{
				return false;
			}
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("������һ�����������:");  
		year= scanner.nextInt();
		boolean l=isLeap();
		System.out.println("�Ƿ������꣺"+l);
	}

}
