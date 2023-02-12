package interfaceex;

//interface는 여러개 상속 가능, class는 상속 하나만 가능

public class CompleteCalc extends Calculator{

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc interface created");
	}
}
