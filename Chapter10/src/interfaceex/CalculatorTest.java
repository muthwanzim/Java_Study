package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Calc calc = new CompleteCalc();
		
		
		System.out.println(calc.add(num1, num2));
		
	}

}
