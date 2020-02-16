package JavaTask;

public class partThree {
	
		
		/** 
		 * ====TASK 1 - Fibonacci series====
		 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . 
		 * up to a given number. 
		 */
		
		
		public static void fibonacci(int length) {
		int f1 = 0;
		int f2 = 1;
		System.out.print(1 + " ");
		
		for(int i = 1; i < length; i++) {
			
			int sum = f1 + f2;
			System.out.print(sum + " ");
			f1 = f2;
			f2 = sum;
		}
	}
		
		/**
		 * =====TASK 2 - A prime number====
		 * Write a Java program to check if a given number is prime or not. 
		 * Remember, a prime number is a number which is not divisible by any other number, 
		 * e.g. 3, 5, 7, 11, 13, 17, etc.
		 * prime can divide only on 1 and on yourself
		 * 
		 */
		
	public static void isNumberIsPrime(int x) {
		if(x/1 == x && x/x == 1 && x%2 != 0) {
			System.out.println(x + " --> Prime");
		}else {
			System.out.println(x + " --> Not Prime");
		}
		
	}
		
		
		/**
		 * ====TASK 3 - String Palindrome =====
		 * You need to write a simple Java program to check if a given String is palindrome or not. 
		 * A Palindrome is a String which is equal to the reverse of itself, e.g., 
		 * "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
		 */
	
		public static void isPalindrome(String word) {
			String firstHalfWord = "";
			String secondHalfWord = "";
		
		//retrieve first half of word
		for(int i = 0; i <= word.length()/2; i++) {
			firstHalfWord = firstHalfWord + word.charAt(i);
		}
		
		//retrieve second half of word
		for(int y = word.length()-1; y >= word.length()/2; y-- ) {
			secondHalfWord = secondHalfWord + word.charAt(y);
		}
		
		//check
		if(firstHalfWord.toLowerCase().equals(secondHalfWord.toLowerCase())) {
			System.out.println(word + " is palindrome");
		}else {
			System.out.println(word + " is not palindrome");
		}
	}
		
	
	
	
	
		
		public static void main(String[] args) {
			
			fibonacci(10);
			System.out.println();
			
			isNumberIsPrime(17);
			isNumberIsPrime(16);
			
			isPalindrome("Arira");
			isPalindrome("Flamingo");
			
	}

}
