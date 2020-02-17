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
			String reversedWord = "";
			
			for(int i = word.length()-1; i >= 0; i--) {
				reversedWord = reversedWord  + word.charAt(i);
			}
			
			if(word.toLowerCase().equals(reversedWord.toLowerCase())) {
				System.out.println(word + " is palindrome");
			}else {
				System.out.println(word + " is not palindrome");
			}
		}	
			
		
		
		/**
		 * ====TASK 4 - Integer Palindrome =====
		 * This is generally asked as follow-up or alternative of the previous program. 
		 * This time you need to check if given Integer is palindrome or not. 
		 * An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, 
		 * but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. 
		 * You can use divide by 10 to reduce the number and modulus 10 to get the last digit. 
		 * This trick is used to solve this problem.
		 */
		
		
		public static void isPalindrome(int number) {
			
			int palindrome = number;
			int reverse = 0;
			
			while(palindrome != 0) {
				int remainder = palindrome%10;
				reverse = reverse * 10 + remainder;
				palindrome = palindrome / 10;
			}
			
			if(number == reverse) {
				System.out.println(number + " is palindrome");
			}else {
				System.out.println(number + " is not palindrome");
			}
			
		}
		
		
	
	
		
		public static void main(String[] args) {
			
			fibonacci(10);
			System.out.println();
			
			isNumberIsPrime(17);
			isNumberIsPrime(16);
			
			isPalindrome("Arira");
			isPalindrome("Flamingo");
			isPalindrome("ZooZ");
			
			isPalindrome(101);
		
	}

}