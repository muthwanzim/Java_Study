package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Kim = new Student(1001, "kim");
		
		Kim.addSubject("english", 100);
		Kim.addSubject("math", 95);
		
		Kim.showStudentInfo();
		
		Student Park = new Student(1002, "park");
		
		Park.addSubject("english", 80);
		Park.addSubject("math", 100);
		Park.addSubject("science", 95);
		
		Park.showStudentInfo();
	}

}
