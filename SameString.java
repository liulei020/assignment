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
		//�õ�һ���ַ���ȥ�ͺ����ȥ�Ƚϣ�����һ��arrylist,��ͬ����ð�ݷ���ȥ���򣨡�lenth���������һ��������ġ�
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
		// �Ӽ�������һ���ַ������ո�������ͽ����Ϊ����С���ַ�����Ȼ��Լ���С���ַ������бȶ�

		System.out.println("�����������ַ������Կո������");
		group= new ArrayList<String>();
		inputData();
		ArrayList<String> group= new ArrayList<String>();

	}

}