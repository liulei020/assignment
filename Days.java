package LeapYear;

import java.util.Scanner;

public class Days {
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

	public static int getDays(boolean lp){
		if(lp){
			return 366;
		}else{
			return 356;
		}
	}


	public static String convertBoolean(boolean lp){
		if(lp){
			return "����������";
		}else{
			return "������ƽ��";
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("������һ�����������:");  
		year= scanner.nextInt();
		boolean lp=isLeap();
		int num=getDays(lp);
		String cb=convertBoolean(lp);
		System.out.println(cb+",��ô�����У�"+num+"�졣");
	}

}
