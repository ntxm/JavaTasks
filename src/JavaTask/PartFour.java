package JavaTask;

import java.util.ArrayList;
import java.util.Iterator;




public class PartFour {

	public static void main(String[] args) {
		
		/**
		 * Iterator
		 */
		ArrayList<String> arr = new ArrayList<>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
		char smooch = 'x';
		System.out.println((int) smooch);
		
		

	}

}
