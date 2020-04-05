package JavaTaskPractice;

import java.util.Arrays;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		
		String[] array = {"New York", "Boston", "Miami", "Los Angeles", "San Francisco", "Seattle"};
		
		Arrays.sort(array);
		
		for(String city: array) {
			
			System.out.print(city + ", ");
		}

	}

}
