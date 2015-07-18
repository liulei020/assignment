package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class IDCard {

	private static final Exception Exception = null;
	private static String str;
	static ArrayList<Integer> group;
	static int idnum;
	static int sum;
	static String[] arr;

	//从键盘输入身份证号;
	public static void inputData(){
		Scanner scanner = new Scanner(System.in);
		str= scanner.next();
		arr=new String[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i] = str.substring(i, (i+1));
		}
	}	
	//输入数据必须是0~9的数字类型，否则报错重输
	public static void dataDispose(){
		try{
			for(int j=0;j<17;j++){
				idnum=Integer.parseInt(arr[j]);
				group.add(idnum);
				//System.out.println("DownLoading:"+group);
			}
			if(idnum<0 || idnum>9){
				throw Exception;
			}
			if(arr.length!=18){
				throw Exception;
			}
		}catch(Exception e){
			System.out.println("输入有误");
			inputData();
			dataDispose();
		}

	}

	/**将前面的身份证号码17位数分别乘以不同的系数并求和。
	从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2;*/
	public static double getSum(ArrayList<Integer> group){
		sum=0;
		int[] coefficient= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		for(int i=0;i<17;i++){
			sum+=coefficient[i]*group.get(i);
			//System.out.println("读取系数"+coefficient[i]+"，读取身份证单位号"+group.get(i));
			//System.out.println("第"+i+"次求和 :"+sum);
		}
		return sum;
	}

	/**分析错误,每位取余数，实现其他功能的开发留下做启发;
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

		}*/


	/**身份证号校验码判定，余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字。
	               其分别对应的最后一位身份证的号码为1－0－X－9－8－7－6－5－4－3－2;
	 */
	public static boolean judge(){
		boolean  condition = false;
		int mod=sum%11;
		//System.out.println("余数为："+mod);
		switch(mod){
		case 0: if(arr[17].equals("1")){condition=true;}else{condition=false;} break;
		case 1: if(arr[17].equals("0")){condition=true;}else{condition=false;} break;
		case 2: if(arr[17].equals("X")){condition=true;}else{condition=false;} break;
		case 3: if(arr[17].equals("9")){ condition=true;}else{condition=false;} break;
		case 4: if(arr[17].equals("8")){ condition=true;}else{condition=false;} break;
		case 5: if(arr[17].equals("7")){ condition=true;}else{condition=false;} break;
		case 6: if(arr[17].equals("6")){ condition=true;}else{condition=false;} break;
		case 7: if(arr[17].equals("5")){ condition=true;}else{condition=false;} break;
		case 8: if(arr[17].equals("4")){ condition=true;}else{condition=false;} break;
		case 9: if(arr[17].equals("3")){ condition=true;}else{condition=false;} break;
		case 10: if(arr[17].equals("2")){ condition=true;}else{condition=false;} break;
		default:condition=false;break;
		}
		return condition;
	}
	public static void main(String[] args) {
		System.out.println();
		System.out.println("请输入你的身份证号  ：");
		group = new ArrayList<Integer>();
		inputData();
		dataDispose();
		judge();
		getSum(group);
		//System.out.println();
		boolean con=judge();
		System.out.println("身份证号前17位为："+group+"，校验位为："+arr[17]+" 的证件");
		System.out.println();
		System.out.println("是否合法 : "+con);

	}

}
