package AverageScore;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageScore {

	private static final Exception Exception = null;
	private static Integer grades;
	private static String str;
	static ArrayList<Integer> scores;
	static String[] temp;

	static double averageScore(ArrayList<Integer> scores){
		double sum=0;
		for(int i=0;i<scores.size();i++){
			sum+=scores.get(i);
		}
		return sum/scores.size();
	}

	public static void inputData(){

		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		temp = str.split(",");
	}
	public static void judge(){
		try{
			int k=0;
			grades =Integer.parseInt(temp[k]);
			if(grades<0){
				throw Exception;
			} 
		}catch(Exception e){
			System.out.println("输入有误：");
			inputData();
			judge();
		}finally{
			for(int k= 0;k < temp.length;k++){
				scores.add(grades);
			}
		}
	}
	public static void main(String[] args) {   
		System.out.println();
		System.out.println("请输入若干个学生成绩(以逗号分隔)：");
		scores = new ArrayList<Integer>();
		inputData();
		judge();
		System.out.println(averageScore(scores));
	}
}


