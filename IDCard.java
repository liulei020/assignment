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

	//�Ӽ����������֤��;
	public static void inputData(){
		Scanner scanner = new Scanner(System.in);
		str= scanner.next();
		arr=new String[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i] = str.substring(i, (i+1));
		}
	}	
	//�������ݱ�����0~9���������ͣ����򱨴�����
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
			System.out.println("��������");
			inputData();
			dataDispose();
		}

	}

	/**��ǰ������֤����17λ���ֱ���Բ�ͬ��ϵ������͡�
	�ӵ�һλ����ʮ��λ��ϵ���ֱ�Ϊ��7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2;*/
	public static double getSum(ArrayList<Integer> group){
		sum=0;
		int[] coefficient= {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		for(int i=0;i<17;i++){
			sum+=coefficient[i]*group.get(i);
			//System.out.println("��ȡϵ��"+coefficient[i]+"����ȡ���֤��λ��"+group.get(i));
			//System.out.println("��"+i+"����� :"+sum);
		}
		return sum;
	}

	/**��������,ÿλȡ������ʵ���������ܵĿ�������������;
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


	/**���֤��У�����ж�������ֻ������0��1��2��3��4��5��6��7��8��9��10��11�����֡�
	               ��ֱ��Ӧ�����һλ���֤�ĺ���Ϊ1��0��X��9��8��7��6��5��4��3��2;
	 */
	public static boolean judge(){
		boolean  condition = false;
		int mod=sum%11;
		//System.out.println("����Ϊ��"+mod);
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
		System.out.println("������������֤��  ��");
		group = new ArrayList<Integer>();
		inputData();
		dataDispose();
		judge();
		getSum(group);
		//System.out.println();
		boolean con=judge();
		System.out.println("���֤��ǰ17λΪ��"+group+"��У��λΪ��"+arr[17]+" ��֤��");
		System.out.println();
		System.out.println("�Ƿ�Ϸ� : "+con);

	}

}
