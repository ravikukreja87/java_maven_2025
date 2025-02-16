package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4Iterator {

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

//		System.out.println(studentData);

		// Keys must be unique

		// I need to print value Mark if present in map
		for (Map.Entry<Integer, String> entry : studentData.entrySet()) {
			if (entry.getValue().equals("Mark")) {

				System.out.println("Key  = " + entry.getKey());
				System.out.println("Value = " + entry.getValue());
				break;
			}
			
		}

	}

}
