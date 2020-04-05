package JavaTaskPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListOfStrings {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Todd");
		list.add("Mattew");
		list.add("Donovan");
		list.add("Ariello");
		list.add("Matilda");
		
		System.out.println("Unsorted list:: " + list);
		
		Collections.sort(list);
		
		System.out.println("Sorted list:: " + list);
		

	}

}
