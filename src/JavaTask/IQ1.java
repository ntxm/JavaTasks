package JavaTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IQ1 {

	public static void main(String[] args) {
/*
 * Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
 * 	without a temporary variable?
 */
		
		//swap numbers
		int a=15;
		int b=45;
		a = a + b; //15+45; a = 60, b = 45
		b = a - b;	//60-45;a = 60, b = 15
		a = a - b; //60-10; a = 45, b = 15
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//swap strings
		String x="Hello";
		String y="Welcome";
		
		x = x+y; //HelloWelcome
		y = x.substring(0,x.length() - y.length()); //, x = HelloWelcome; y = "Hello"
		x = x.substring(y.length());
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		/*
		 * Write a java program to find the second largest number in the array? 
		 * Maximum and minimum number in the array?
		 */
		
		int[] array = {15,15, 20, 22, 10};
		Arrays.sort(array);
		int secondLargest= array.length-2;
		System.out.println(array[secondLargest]);
		
		
		
	}

}
