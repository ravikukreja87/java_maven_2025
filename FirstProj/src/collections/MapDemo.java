package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> studentData = new HashMap<Integer, String>();
		// 1 - Jon
		// 2 - Mark
		// 3 - Tom
		// 20 - Greg

		studentData.put(1, "Jon");
		studentData.put(2, "Mark");
		studentData.put(3, "Tom");
		studentData.put(20, "Greg");

		System.out.println(studentData);

		// Keys must be unique

		boolean hasValue = studentData.containsValue("David");
		System.out.println(hasValue);
		System.out.println(studentData.get(20));

		System.out.println(studentData.isEmpty());
		
		studentData.remove(3);
		System.out.println(studentData);
		
		studentData.replace(2, "Tom");
		System.out.println(studentData);

		System.out.println(studentData.size());
		
		
		
	}

}
