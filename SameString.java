package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class SameString {

	static String str;
	static ArrayList<String> group,gp;
	static String[] temp;

	public static void inputData(){
		Scanner scanner = new Scanner(System.in);
		str= scanner.nextLine();
		temp = str.split(" ");
		for(int k= 0;k <temp.length;k++){
			group.add(str);
		}
	}
	public void judeg(){
		//拿第一个字符串去和后面的去比较，存入一个arrylist,相同的用冒泡法则去排序（。lenth），输出第一个便是最长的。
		gp= new ArrayList<String>();
		for(int i=0;i<temp.length;i++){
			if(group.get(i).equals(group.get(i+1))){

			}
		}
		String tmp;
		for(int j=0;j<gp.size();j++){
			for(int k=0;k<gp.size()-j;k++)
				tmp=gp.get(k);
			gp.get(k)=gp.get(k+1);
			gp.get(k+1)=tmp;
		}

	}
	public static void main(String[] args) {
		// 从键盘输入一串字符串，空格隔开，就将其分为几个小的字符串。然后对几个小的字符串进行比对

		System.out.println("请输入若干字符串，以空格隔开：");
		group= new ArrayList<String>();
		inputData();
		ArrayList<String> group= new ArrayList<String>();

	}

}