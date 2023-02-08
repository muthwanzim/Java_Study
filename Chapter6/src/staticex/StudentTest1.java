package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student Kim = new Student();
		System.out.println(Kim.studentID);
		
		Student Park = new Student();
		System.out.println(Park.studentID);
		
		System.out.println(Kim.serialNum);
		System.out.println(Park.serialNum);
	}

}
