package GuessNumber;

import java.util.Scanner;

public class Guess {
	public static int num;
	public static int guess(int num){

		int n=1,low=0,high=100;
		int mid=(low+high)/2;
		//while 条件首次判断，n从1开始。一旦进行到内部循环，次数（n）先自增，进入“二次”判断;
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
		System.out.println("请输入年龄:");  
		num = scanner.nextInt();
		System.out.println("请输入0~100以内的整数：");
		System.out.println("程序判断了"+guess(num)+"猜到用户输入的数字为："+num);	
	}

}
