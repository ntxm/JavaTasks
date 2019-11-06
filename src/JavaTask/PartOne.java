package JavaTask;
import java.util.Arrays;
import java.util.Scanner;


public class PartOne {

	public static void main(String[] args) {
		
		
		
		
		
		
				//task1
				//Write a program to swap 2 numbers without a temporary variable? 
				//Swap 2 strings without a temporary variable?
				int a = 10;
				int b = 20;
				
				a = a + b; //10+20 = 30
				b = a - b; //30 - 20 = 10
				a = a - b; //30 - 10 = 20
				
				System.out.println("a = " + a + " b = " + b);
				
				
				//Task2
				//Write a java program to find the second largest number in the array? 
				//Maximum and minimum number in the array?
				
				int[] array = {15, 11, 24, 44, 9, 14, 56, 30};
				int max = array[0];
				int min = array[0];
				int max2 = array[0];
				for(int i = 0; i < array.length; i++) {
					//maximum number
					if(max < array[i]) {
						max = array[i];
					}
				
					//minimum number
					if(min > array[i]) {
						min = array[i];
					}
				}
			
				System.out.println(max);
				System.out.println(min);
				
				
				
				
				//Task2 USING ARRAY SORT
				//Write a java program to find the second largest number in the array? 
				//Maximum and minimum number in the array?	
				
				
				int[] array1 = {15, 11, 24, 44, 9, 14, 56, 30};
				Arrays.sort(array1);
				int length = array1.length;
				
				System.out.println("Minimum is " + array1[0]);
				System.out.println("Maximum is " + array1[length-1]);
				System.out.println("The second largest is " + array1[length-2]);
				
				
				
				//Task3
				//Find out how many alpha characters present in a string?
				
				String str = "HelloTrololo2239^&((!! Every day the same&*&_$$$$$";
				String str1 = str.replaceAll("[^a-zA-Z]", "");

				System.out.println(str1);
				System.out.println(str1.length());
				
				
				
				//Task4
				//How to find out the part of the string from a string? 
				//What is substring? Find number of words in string?
				
				String str2 = "This is November and weather still great";
				String[] array2 = str2.split(" ");
				for(int i = 0; i < array2.length; i++) {
					System.out.println(array2[i]);
					System.out.println(array2.length);
				}
				
				
				
				//Task5
				//5. Write a java program to reverse String? Reverse a string word by word?
				
				//Part1: Write a java program to reverse String
				String str3 = "This is November and weather still great";
				char[] arrChar = str3.toCharArray();
				for(int i = arrChar.length - 1; i >= 0; i--) {
					System.out.print(arrChar[i]);
				}
				
				System.out.println();
				//Part2: Reverse a string word by word
				
				String[] arrString = str3.split(" ");
				for(int i = arrString.length - 1; i >= 0; i--) {
					System.out.print(arrString[i]+ " ");
				}
				
				
				System.out.println(" ");
				
				
				
				
				//Task6 
				//6. Write a Java Program to find whether a String is palindrome or not?
				
				
				String str4 = "repaper";
				String rev = "";
				String rev1 = "";
				
				for(int l = 0; l <= str4.length()/2; l++) {
					rev = rev + str4.charAt(l);
					
				}
				
				for(int l = str4.length()-1; l >= str4.length()/2; l--) {
					rev1 = rev1 + str4.charAt(l);
				}
				
				
				if(rev1.equals(rev)) {
					System.out.println("This is palindrome");
				}else {
					System.out.println("This is not palindrome");
				}
				
				
				
				
				
				//Task7
				//Write a java program to check whether a given number is prime or not?
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Enter the number::");
				int x = scan.nextInt();
				
				if(x > 1) {
				
					boolean ifPrime = true;
				
					//check if number prime or not
					for(int i = 2; i < x; i++) {
						
						if(x%i == 0) {
							ifPrime = false;
							break;
							
						}else {
							ifPrime = true;
						}	
					}
					
					// result output
					if (ifPrime == true) {
						System.out.println("Prime");
					}else {
						System.out.println("None");
					}
					
				}else {
					System.err.println("None. Prime number can be more then 1");
				}
				
				
				
				//Task 8 
				//Write a Java Program to print first 10 numbers of Fibonacci series.
				
				
				// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
				//f0 f1 f2
				
				int f0 = 1;
				int f1 = 1;
				int f2 = 0;
				
				System.out.print(f0 + " " + f1 + " ");
				
				for(int f = 3; f < 11; f++) {
					
					f2 = f0 + f1;
					System.out.print(f2 + " ");
					f0 = f1;
					f1 = f2;
				}
				
				
				
				
				
				
				
				
			}

	}


