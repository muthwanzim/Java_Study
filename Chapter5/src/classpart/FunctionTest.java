package classpart;

public class FunctionTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
	
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}

/** 스택 메모리?
 * main() -> addNum()
 * 
 *  addNum() [n1, n2, result]
 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *  main() [num1, num2, sum] 
 *  
 *  addNum() 함 호출이 끝나면 자동으로 없어진다
 *  
 *  main() [num1, num2, sum]
 *  
 */