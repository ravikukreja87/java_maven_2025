package collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfCitiesMap3 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		
		
		//Insert number between 1 to 10 in list
		
		for(int i = 1 ; i < 1001 ; i++) {
			numbers.add(i);
		}
		
		
		
		System.out.println(numbers);
		// Add all numbers in the list
		int result = 0;

		for (int number : numbers) {
			result = result + number;
		}

		System.out.println("Sum = " + result);

	}

}
