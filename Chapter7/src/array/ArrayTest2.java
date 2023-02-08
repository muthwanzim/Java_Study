package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] studentIDs = new double[5];
		int size = 0;
		
		studentIDs[0] = 10.0; size++;
		studentIDs[1] = 20.0; size++;
		studentIDs[2] = 30.0; size++;
		
		double total = 1.0;
		for (int i = 0; i < size; i++) {
			total *= studentIDs[i];
		}
		
		System.out.println("total " + total);

	}

}
