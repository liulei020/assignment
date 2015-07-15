package AverageScore;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageScore {

	private static Integer grades;
	private static boolean judgement;


	static double averageScore(ArrayList<Integer> scores){
		double sum=0;
		int n=scores.size()-1;
		for(int i=0;i<n;i++){
			sum+=scores.get(i);
		}
		return sum/n;
	}

	/**
	{
	double sum=0,tmp = 0;
	int n=scores.size()-1;
	for(Integer x:scores){
		tmp+=x;
		sum=tmp+1;
	}
	return sum/n;
	}
	 */

	/**
	{
	int i=0;
	double sum=0;
	int n=scores.size()-1;
	while(i<n){
		sum+=scores.get(i);
		i++;
	}
	return sum/n;
    } 
	 */

	/**
	int i=0;
	double sum=0;
	int n=scores.size()-1;
	do{
		sum+=scores.get(i);
		i++;
	}while(i<n);
	return sum/n;
    }
	 */
	public static boolean isNumeric(String str){  
		int n=str.length()-2;
		for (int i=0;i<n;i++){    
			if (!Character.isDigit(str.charAt(i))){  
				return false;  
			}  
		}  
		return true;  
	}  


	public static void main(String[] args) {   
		System.out.println("如果你想结束输入，请输入'-1'作为一条结束命令，从而求取上列成绩的平均分:");
		System.out.println();
		System.out.println("请输入你的各科成绩:");
		ArrayList<Integer> scores = new ArrayList<Integer>();
		do{
			Scanner scanner = new Scanner(System.in);    
			String str = scanner.next();
			judgement =isNumeric(str);
			grades =Integer.parseInt(str);
			scores.add(grades);
		}while(grades!=-1);
		if(judgement==true){
			System.out.println(averageScore(scores));
		}else{
			System.out.println("输入有误！！");
			System.out.println("请重新输入成绩(纯数字类型):");
			/**
			do{
				Scanner scanner = new Scanner(System.in);    
				String str = scanner.next();
				judgement =isNumeric(str);
				grades =Integer.parseInt(str);
				scores.add(grades);
			}while(grades!=-1);
			System.out.println(averageScore(scores));
			 */
			//Question_1:isNumeric()判断非数字返回false，继而我又用if条件报错，为什么输入字母/特殊符号还是不能检测？

			//Question_1:底部备注部分，重新进行数据输入，但是加上这段，系统报错NaN!!
		}
	}
}

