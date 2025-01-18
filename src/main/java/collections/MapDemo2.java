package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, String> employeeData = new HashMap<String, String>();
		// Name - Designation

		employeeData.put("Jon", "Manager");
		employeeData.put("Mark", "Supervisor");
		
		System.out.println(employeeData);

	}

}
