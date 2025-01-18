package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, String> employeeDesignations = new TreeMap<String, String>();
		
		employeeDesignations.put("Jon", "Manager");
		employeeDesignations.put("Albert", "Supervisor");
		employeeDesignations.put("David", "Associate");
		
		System.out.println(employeeDesignations);
		
	}

}
