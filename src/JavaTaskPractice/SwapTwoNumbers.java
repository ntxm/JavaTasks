package JavaTaskPractice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		/*
		 * Write Java code to swap two numbers without using a temporary variable?
		 */
		
		int a = 255;
		int b = 19;
		
		a = a + b; //274
		b = a - b; //255
		a = a - b; //19
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
