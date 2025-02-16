package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.random.RandomGenerator;

public class SetTree2 {

	public static void main(String[] args) {

		Set<Integer> randomNumbers = new TreeSet<Integer>();// Empty set of cities

		for (int i = 1; i < 11; i++) {
			Random random = new Random();
			int uniqueNumber = random.nextInt(1, 10);
			System.out.println("Unique number is = " + uniqueNumber);
			randomNumbers.add(uniqueNumber);
		}

		System.out.println(randomNumbers);
		System.out.println(randomNumbers.size());

	}

}
