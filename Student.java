package Class;

public class Student {

	private String name;
	private String major;
	private int grade;
	private int[] cet4_scores;

	public Student(String name,String major,int grade,int[] cet4_scores){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.cet4_scores=cet4_scores;
	}

	public String getName(){
		return name;
	}

	public String getMajor(){
		return major;
	}

	public int getGrade(){
		return grade;
	}

	public int[] cet4_scores(){
		return cet4_scores;
	}

	public void level_up(){
		grade++;
	}

	public boolean passed_cet4(){
		for(int i=0;i<cet4_scores.length;i++){
			if(cet4_scores[i]>=425){
				return true;
			}
		}
		return false;

	}

	public void printInfo(){
		System.out.println("Student's Name  :"+getName()+"\n");
		System.out.println("Student's Grade :"+getGrade()+"\n");
		System.out.println("Student's major :"+getMajor()+"\n");
		System.out.println("Pass CET4 :"+passed_cet4()+"\n");
	}
}
