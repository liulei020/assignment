package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class IDCard {
	private static final Exception Exception = null;
	private static String str;
	static ArrayList<Integer> group;
	static int idnum;
	static String[] temp;
	public static void inputData(){
		Scanner scanner = new Scanner(System.in);
		str= scanner.nextLine();
		temp = str.split(" ");
	}

	public static void isDigit(){
		try{
			int k=0;
			idnum =Integer.parseInt(temp[k]);
			if(idnum<0 && idnum>9){
				throw Exception;
			} 
		}catch(Exception e){
			System.out.println("╩ф╚ы╙╨╬єг║");
			inputData();
			isDigit();
		}finally{
			for(int k= 0;k <temp.length;k++){
				group.add(idnum);
			}
		}
	}

	static double getSum(ArrayList<Integer> group){
		double sum=0;
		int[] coefficient= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		for(int i=0;i<17;i++){
			sum+=coefficient[i]*group.get(i);
			//System.out.println(sum);
		}
		return sum;
	}
	public static ArrayList<Integer> getRemainder(){
		double sum=0;double tmp=0;
		int[] coefficient= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		ArrayList<Integer> remaininder= new ArrayList<Integer>();
		for(int i=0;i<17;i++){
			sum+=coefficient[i]*group.get(i);
			for(int j=0;j<17;j++){
				remaininder.add((int) (sum%1));
			}
		}
		return remaininder;

	}
	public static void judge(){
		for(int i=0;i<17;i++){
			switch(iremaininder.get(i)){
			case 0 0гн1гн2гн3гн4гн5гн6гн7гн8гн9гн10
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		group = new ArrayList<Integer>();
		inputData();
		isDigit();
		System.out.println(getSum(group));
		System.out.println(getRemainder());

	}

}
