package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class Substring {
	public static String str;
	public static char[] trans; 
	public static String fetch;
	public static ArrayList<String> group;
	//�Ӽ������������ַ����������浽һ��ArryList������ã�
	public void inputData(){
		group = new ArrayList<String>();
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Please input Strings,write 'over' to quit ��");
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
			System.out.print("�ַ����飺"+trans[j]);
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
1.����һ��str a�����ַ���

+1. a--arrlist group

2. arr.0 �� a.0 check all. no stop,send same to new arrlist b  ;
   b.0.len+1 start a.0 check  same stop,send no to b.1;
   ...a.length over

   ���������жϷ��� about no/same
   b.i ż���洢��ͬ���ַ���

3. ��ȡb��ż���жϳ��ȣ�ð�������ײ���β��һ���������̡�

4. ��ȡb.ż����.����ַ���������ȡ�䳤�ȡ�

5. �ظ�2��a.1 start. until arr.length over

6. �Ƚ���ȡ�������ַ������� ����������ͬ ������asII, min out.

   

   
   Q1:                                  i  j         i-i j-j
     �ַ���--al�ַ�����--�ַ�����0               Ԫ��0��1�Ƚ�    ����---0-0 1-1     StringBufer subs={0=eg��a����same��no break}
                                
                                                      2        ����-- 0-0 2-2
                                                      3
                                                     ...

                                                                                                            λ��subs.length��ʼ��Ԫ��0��+1�Ƚ�     ����--            subs={subs.length=��b����no��same break}
                                                     +2   
                                                     +3
                                                     ...
                                              
                                               to be contnue..until arr[0].length
*/