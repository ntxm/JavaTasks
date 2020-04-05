package JavaTaskPractice;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		/*
		 * Write a function to reverse a number in Java?
		 */
		
		long original = 123456;
		long reverse = 0;
		System.out.println("Original: " + original);
		
		while(original != 0) {
			reverse = (reverse * 10) + (original % 10);
			original = original / 10;
			
		}
		
		
		System.out.println("Reversed: " + reverse);
	}

}
