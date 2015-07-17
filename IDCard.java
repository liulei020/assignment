package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class IDCard {
	private static final Exception Exception = null;
	private static String str;
	static ArrayList<Integer> group;
	static int idnum;
	static int sum;
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
			System.out.println("输入有误：");
			inputData();
			isDigit();
		}finally{
			for(int k= 0;k <temp.length;k++){
				group.add(idnum);
			}
		}
	}


	public static double getSum(ArrayList<Integer> group){
		sum=0;
		int[] coefficient= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		for(int i=0;i<17;i++){
			sum+=coefficient[i]*group.get(i);
			System.out.println(sum);
		}
		return sum;
	}
	/**分析错误,每位取余数，实现其他功能的开发留下做启发；
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
	 */
	public static boolean judge(){
		boolean  condition = false;
		int mod=sum%17;
		switch(mod){
		case 0: if(group.get(17).equals(1)){condition=true;}else{condition=false;} break;
		case 1: if(group.get(17).equals(0)){condition=true;}else{condition=false;} break;
		case 2: if(group.get(17).equals('x')){condition=true;}else{condition=false;} break;
		case 3: if(group.get(17).equals(9)){ condition=true;}else{condition=false;} break;
		case 4: if(group.get(17).equals(8)){ condition=true;}else{condition=false;} break;
		case 5: if(group.get(17).equals(7)){ condition=true;}else{condition=false;} break;
		case 6: if(group.get(17).equals(6)){ condition=true;}else{condition=false;} break;
		case 7: if(group.get(17).equals(5)){ condition=true;}else{condition=false;} break;
		case 8: if(group.get(17).equals(4)){ condition=true;}else{condition=false;} break;
		case 9: if(group.get(17).equals(3)){ condition=true;}else{condition=false;} break;
		case 10: if(group.get(17).equals(2)){ condition=true;}else{condition=false;} break;
		default:System.out.println("error");
		}
		return condition;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		group = new ArrayList<Integer>();
		inputData();
		isDigit();
		getSum(group);
		boolean con=judge();
		System.out.println(sum%17);
		System.out.println(sum);
		System.out.println("是否身份证号码合法"+con);

	}

}
