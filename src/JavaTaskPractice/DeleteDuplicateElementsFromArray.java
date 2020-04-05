package JavaTaskPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		/*
		 * Write code to filter duplicate elements from an array and print as a list?
		 */
		
		int[] array = {25, 35, 33, 11, 24, 25, 35, 12, 5, 77, 11};
		Arrays.sort(array);

		
		//add array elements to arrayList
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i < array.length; i++) {
			
				list.add(array[i]);
		}
		
		System.out.println("List before removing duplicates:: " + list);
	
	
		
		
		for(int i = 0; i < list.size()-1; i++) {
			if(list.get(i).equals(list.get(i+1))) {
				list.remove(i);
			}
		}
		
		System.out.println("List after removing duplicates:: " + list);

	}
	
	

}
