package Text;

import Class.Student;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] grades={461};
		Student student=new Student("liulei", "electronic information engineering", 3,grades);
		student.printInfo();
		student.level_up();
		student.printInfo();

	}

}
