package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		
		final double PI = 3.14;
		
		//상수로 쓰는게 뭐가 좋냐?
		final int STUDENT_NUM = 31;
		
		int num = 0;
		if ( num == STUDENT_NUM) {}
		
		System.out.println(STUDENT_NUM);
	}

}
