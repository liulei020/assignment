package GuessNumber;

import java.util.Scanner;

public class Guess {
	public static int num;
	public static int guess(int num){

		int n=1,low=0,high=100;
		int mid=(low+high)/2;
		//while �����״��жϣ�n��1��ʼ��һ�����е��ڲ�ѭ����������n�������������롰���Ρ��ж�;
		while(low<high && mid!=num){
			++n;
			if(mid<num){
				low=mid+1;
			}else{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);    
		System.out.println("����������:");  
		num = scanner.nextInt();
		System.out.println("������0~100���ڵ�������");
		System.out.println("�����ж���"+guess(num)+"�µ��û����������Ϊ��"+num);	
	}

}
