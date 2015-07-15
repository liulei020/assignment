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
		System.out.println("�������������룬������'-1'��Ϊһ����������Ӷ���ȡ���гɼ���ƽ����:");
		System.out.println();
		System.out.println("��������ĸ��Ƴɼ�:");
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
			System.out.println("�������󣡣�");
			System.out.println("����������ɼ�(����������):");
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
			//Question_1:isNumeric()�жϷ����ַ���false���̶�������if��������Ϊʲô������ĸ/������Ż��ǲ��ܼ�⣿

			//Question_1:�ײ���ע���֣����½����������룬���Ǽ�����Σ�ϵͳ����NaN!!
		}
	}
}

