package JavaTaskPractice;

public class NumberIsPrimeOrNo {
	
	
	public static void main(String[] args) {

	/*
	 * Write a method to check prime no. in Java?
	 *  *Prime number can be divide only by 1 and by yourself
	 *   Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
	 *   83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 
	 */
	
	int number = 6;
	
	//number should be > 1
	if(number > 1) {
		//create a marker
		boolean ifPrime = true;
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				ifPrime = false;
				break;
			}else {
				ifPrime = true;
			}
		}
		
		//result output
		if(ifPrime == true) {
			System.out.println(number + " is Prime");
		}else {
			System.out.println(number + " is not Prime");
		}
		
		//number cannot be < 1
	}else {
		System.out.println("Prime number should be > 1");
	}

}
	
}
