package JavaTask;

import java.util.Arrays;

public class partThree {

	/**
	 * ====TASK 1 - Fibonacci series==== 
	 * Write a simple Java program which will
	 * print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
	 */

	public static void fibonacci(int length) {
		int f1 = 0;
		int f2 = 1;
		System.out.print(1 + " ");

		for (int i = 1; i < length; i++) {

			int sum = f1 + f2;
			System.out.print(sum + " ");
			f1 = f2;
			f2 = sum;
		}
	}

	/**
	 * =====TASK 2 - A prime number==== 
	 * Write a Java program to check if a given
	 * number is prime or not. Remember, a prime number is a number which is not
	 * divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. prime can
	 * divide only on 1 and on yourself
	 * 
	 */

	public static void isNumberIsPrime(int x) {
		if (x % 2 != 0) {
			System.out.println(x + " --> Prime");
		} else {
			System.out.println(x + " --> Not Prime");
		}

	}

	/**
	 * ====TASK 3 - String Palindrome ===== 
	 * You need to write a simple Java program
	 * to check if a given String is palindrome or not. A Palindrome is a String
	 * which is equal to the reverse of itself, e.g., "Bob" is a palindrome because
	 * of the reverse of "Bob" is also "Bob."
	 */

	public static void isPalindrome(String word) {
		String reversedWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord = reversedWord + word.charAt(i);
		}

		if (word.toLowerCase().equals(reversedWord.toLowerCase())) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
	}

	/**
	 * ====TASK 4 - Integer Palindrome ===== 
	 * This is generally asked as follow-up or
	 * alternative of the previous program. This time you need to check if given
	 * Integer is palindrome or not. An integer is called palindrome if it's equal
	 * to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the
	 * reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10
	 * to reduce the number and modulus 10 to get the last digit. This trick is used
	 * to solve this problem.
	 */

	public static void isPalindrome(int number) {

		int palindrome = number;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (number == reverse) {
			System.out.println(number + " is palindrome");
		} else {
			System.out.println(number + " is not palindrome");
		}

	}

	/**
	 * ====TASK 5 - Armstrong number===== 
	 * A number is called an Armstrong number if
	 * it is equal to the cube of its every digit. For example, 153 is an Armstrong
	 * number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. You need to
	 * write a program to check if the given number is Armstrong number or not.
	 * 
	 * @param 70 and 153 - armstrong numbers 
	 * 
	 */

	public static void armstrong(int number) {
		
		int arms = number;
		int remainder = 0;
		int cube = 0;
		int sum = 0;

		while (arms != 0) {
			remainder = arms % 10; 
			cube = remainder * remainder * remainder;
			sum = sum + cube;
			arms = arms / 10;
		}

		if (sum == number) {
			System.out.println(number + " is Armstrong number");
		} else {
			System.out.println(number + " is NOT Armstrong number");
		}
	}
	
	
	/**
	 * ====TASK 7 - Factorial ===== 
	 * @param x
	 * 
	 * 5! = 5 * 4 * 3 * 2 * 1
	 */
	public static void factorial(int x) {
		
	
		
		int result = 1;
		
		while(x > 0) {
			
			result = result * x;
			x--;
		}
		
		System.out.println(result);

	}
	
	/**
	 * ====TASK 8 - Reverse String =====
	 * This problem is similar to the String Palindrome problem we have discussed above. 
	 * If you can solve that problem, you can solve this as well. You can use indexOf() or substring() 
	 * to reverse a String or alternatively, convert the problem to reverse an array by operating on 
	 * character array instead of String.
	 * @param args
	 */
	
	public static void reverse(String word) {
		
		String reverse = "";
		
		for(int i = word.length()-1; i>=0; i--) {
			reverse = reverse + word.charAt(i);
			
		}
		System.out.println(reverse);
	}
	
	
	/**
	 * ====TASK 9 - Reverse Int =====
	 * @param number
	 */
	public static void reverse(int number) {
		//105
		int reverse = 0;
		
		while(number != 0) {

			reverse = (reverse * 10) + (number % 10); //50
				number = number / 10; //10, 1 0.1
			}
			
		System.out.println(reverse);
	}
	
	/**
	 * ====TASK 10 - Max Value from an Array =====
	 * Write A Java Program To Find Out The First Two Max Values From An Array?
	 * 
	 */
	
	public static void maxValue(int a, int b, int c, int d, int e) {
		int[] array = {a, b, c, d, e};
		int maxValue = 0;
		
		
		System.out.println("***For loop***");
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("Max value from an array: " + maxValue);
		
		
		System.out.println("***Enhanced for Loop***");
		for(int value: array) {
			if(value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("Max value from an array: " + maxValue);
		
		
		System.out.println("***Array Sort***");
		Arrays.sort(array);
		System.out.println("Max value from an array: " + array[array.length-1]);
		
	}
	
	/**
	 * ====TASK 11 - Two Max Values from an Array =====
	 * Write A Java Program To Find Out The First Two Max Values From An Array?
	 */
	
	public static void maxValues(int a, int b, int c, int d, int e, int f) {
		int[] array = {a, b, c, d, e, f};
		//    array = 10, 23, 90, 24, 78
		int maxFirst = 0;
		int maxSecond = 0;
		
		for(int value: array) {
			if (maxFirst < value) {
				maxSecond = maxFirst;
				maxFirst = value;
			}else if(maxSecond < value){
				maxSecond = value;
				
			}
		}
		System.out.println("Max two values from array: " + maxFirst + ", " + maxSecond);
	}
	
	
	
	/**
	 * ====TASK ?? - remove duplicate =====
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 */
	
	public static void removeDuplicate (int a, int b, int c, int d, int e) {
		
		int[] array = {a, b, c, d, e};
		Arrays.sort(array);
		
		int[] tempArray = new int[array.length];
		
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] == array[i+1]) {
				
			}
			
			i++;
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
		isPalindrome(2490);

		armstrong(370);
		armstrong(210);
		
		factorial(5);
		factorial(3);
		
		reverse("Brooklyn");
		reverse("Terminator");
		
		reverse(105);
		reverse(40016);
		
		maxValue(33, 89, 23, 105,26);
		maxValue(10, 5, 10, 90, 1);
		
		maxValues(10, 34, 78, 12, 27, 57);
		maxValues(10, 5, 10, 90, 1, 10);
		
		removeDuplicate(10, 19, 11, 11, 18);
		


	}

}
