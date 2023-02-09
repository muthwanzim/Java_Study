package Inheritance;

public class Circle {

	Point point; // has - a 관계
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}

// 이런 경우는 상속을 사용하는게 아님