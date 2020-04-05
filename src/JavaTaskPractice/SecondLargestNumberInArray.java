package JavaTaskPractice;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] array = {25, 11, 1, 34, 78, 77, 83, 23, 36, 7};
		
		int firstLargest = 0;
		int seconfLargest = 0;
		
		for(int num: array) {
			
			if(firstLargest < num) {
				seconfLargest = firstLargest;
				firstLargest = num;
			}else if(seconfLargest  < num) {
				seconfLargest = num;
			}
		}
		
		
		System.out.println("First Largest: " + firstLargest);
		System.out.println("Second Largest: " + seconfLargest);

	}

}
