package GetLevel;

import java.util.Scanner;

public class AgeLevel { 
	static int age;
	public static  String getLevel(){
		if(age<3){
			return "������ε������׶�";
		}else if(age>=3 && age<15){
			return "������ε���������";
		}else if(age>=15 && age<30){
			return "������ε���������";
		}else if(age>=30 && age<55){
			return "������ε���������";
		}else{
			return "������ε���������";
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("����������:");  
		age = scanner.nextInt();
		String gl=getLevel();
		System.out.println(gl);

	}


}
