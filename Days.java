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
			return "该年是闰年";
		}else{
			return "该年是平年";
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("请输入一个整数的年份:");  
		year= scanner.nextInt();
		boolean lp=isLeap();
		int num=getDays(lp);
		String cb=convertBoolean(lp);
		System.out.println(cb+",那么该年有："+num+"天。");
	}

}
