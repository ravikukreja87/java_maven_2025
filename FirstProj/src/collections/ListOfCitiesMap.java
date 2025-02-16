package collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfCitiesMap {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		System.out.println(numbers);
		System.out.println("Size of list = " + numbers.size());

		System.out.println("Is list emprty = " + numbers.isEmpty());

		// Add all numbers in the list
		int result = 0;

		for (int number : numbers) {
			result = result + number;
		}

		System.out.println("Sum = " + result);

	}

}
