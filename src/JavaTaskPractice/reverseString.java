package JavaTaskPractice;

public class reverseString {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to demonstrate string reverse with and without StringBuffer class?
		 */
		
		//WAY 1: with StringBuffer
		String str = "This is for reverse";
		
		StringBuffer buffer = new StringBuffer(str);
		
		buffer.reverse();
		
		System.out.println(buffer);
		
		
		//WAY 2: WithoutBuffer
		
		String word = "New-York";
		String reverse = "";
		
		for(int i = word.length()-1; i >= 0; i--) {
			
			reverse = reverse + word.charAt(i);
		}
		
		System.out.println(reverse);
		
	}

}
