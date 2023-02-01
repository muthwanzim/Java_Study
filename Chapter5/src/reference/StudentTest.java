package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorean(100);
		studentJames.setMath(100);
		
		Student studentThomas = new Student(101, "Thomas");
		studentThomas.setKorean(90);
		studentThomas.setMath(90);
		
		studentJames.showStudentInfo();
		studentThomas.showStudentInfo();
	}

}
