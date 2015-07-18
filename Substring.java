package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Substring {
	public static String str;
	public static char[] trans; 
	public static String fetch;
	public static ArrayList<String> group;
	//从键盘输入若干字符串，并储存到一个ArryList方便调用；
	public void inputData(){
		group = new ArrayList<String>();
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Please input Strings,write 'over' to quit ：");
			str= scanner.next();
			group.add(str);
			System.out.println("DownLoading:"+group);
		}while(!str.equals("over"));
	}

	public void getSubstring(){
		fetch=new String();
		for(int i=0;i<group.size()-1;i++){
			fetch=group.get(i);
			System.out.println("group.git(i):"+group.get(i));
			System.out.println("String:"+fetch);
		}
		trans= fetch.toCharArray();
		for(int j=0;j<fetch.length();j++){
			System.out.print("字符数组："+trans[j]);
		}
	}

	public static void dataDispose(){

	}
	public static void main(String[] args) {
		System.out.println();
		Text sub=new Text();
		sub.inputData();
		sub.getSubstring();

	}
}


		
	
/**
1.定义一个str a接收字符串

+1. a--arrlist group

2. arr.0 中 a.0 check all. no stop,send same to new arrlist b  ;
   b.0.len+1 start a.0 check  same stop,send no to b.1;
   ...a.length over

   构造两个判断方法 about no/same
   b.i 偶数存储相同子字符串

3. 提取b的偶数判断长度，冒泡排序。首部或尾部一定是最长或最短。

4. 提取b.偶数组.最长的字符串，并提取其长度。

5. 重复2。a.1 start. until arr.length over

6. 比较提取出的子字符串长度 。最长输出。相同 ，计算asII, min out.

   

   
   Q1:                                  i  j         i-i j-j
     字符串--al字符数组--字符数组0               元素0与1比较    满足---0-0 1-1     StringBufer subs={0=eg‘a’接same，no break}
                                
                                                      2        满足-- 0-0 2-2
                                                      3
                                                     ...

                                                                                                            位置subs.length开始，元素0与+1比较     满足--            subs={subs.length=‘b’接no，same break}
                                                     +2   
                                                     +3
                                                     ...
                                              
                                               to be contnue..until arr[0].length
*/