package JavaTask;

import java.util.Scanner;

/*
 * Your task is to write a program that reads a sequence of strings and converts them to integer numbers, 
 * multiplying by 10. Some input strings may have an invalid format, for instance: "abc". 
 * The sequence is ended by the 0 (zero).
 *	If a string can be converted to an integer number, output the number multiplied by 10. 
 * Otherwise, output the string "Invalid user input: X" where X is the input string. 
 * To better understand see examples below.
 *	To implement this logic, use the exception handling mechanism.
 *	Input data format:
 *	A sequence of integer numbers and other strings, each in a new line
 *	Output data format:
 *	A sequence of integer numbers and warnings, each in a new line
 */
public class ConvertingSequenceOfNumbers {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int digit = 0;
		int result = 0;
		String str = "";
		
		do{
			try {
			str = scan.nextLine();
			digit = Integer.parseInt(str);
			result = digit * 10;
			if(result != 0) {
			System.out.println(result);
			}
			
	}catch(NumberFormatException ex) {
		System.out.println("Invalid user input: " + str);
	}
	
	
		}while(digit != 0);//end loop

		
	}

}
