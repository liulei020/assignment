package GetLevel;

import java.util.Scanner;

public class AgeLevel { 
	static int age;
	public static  String getLevel(){
		if(age<3){
			return "该年龄段的人是幼儿";
		}else if(age>=3 && age<15){
			return "该年龄段的人是少年";
		}else if(age>=15 && age<30){
			return "该年龄段的人是青年";
		}else if(age>=30 && age<55){
			return "该年龄段的人是中年";
		}else{
			return "该年龄段的人是老年";
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    
		System.out.println("请输入年龄:");  
		age = scanner.nextInt();
		String gl=getLevel();
		System.out.println(gl);

	}


}
