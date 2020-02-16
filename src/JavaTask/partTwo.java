package JavaTask;

import java.util.Scanner;

public class partTwo {

	public static void main(String[] args) {
/*Question: what programming language are you learning here?
 *Java
 *Kotlin
 *Scala
 *Python
 *The program should read the answer’s number from the standard input and output 
 *the result of the test: "Yes!", "No!" or "Unknown number".
 */
		Scanner scan = new Scanner(System.in);
		
        int lang = scan.nextInt();

        switch(lang){
            case 1:
            System.out.println("Yes!");
            break;

            case 2:
            System.out.println("No!");
            break;
            
            case 3:
            System.out.println("No!");
            break;

            case 4:
            System.out.println("No!");
            break;

            default:
            System.out.println("Unknown number");
            break;

        }

	}

}
