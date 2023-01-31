package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		Student studentKim = new Student(100, "김멋짐");
		studentKim.address = "서울시";
		
		Student studentPark = new Student(101, "박지성");
		studentPark.address = "맨체스터시";
		
		studentKim.showStudentInfo();
		studentPark.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentPark);
	}
}


/** 힙 메모리?
 *	new 키워드에 의해 생성
 *	스택 메모리와 다르게 자동으로 없어지지 않음
 *	가비지 컬렉터
*/
