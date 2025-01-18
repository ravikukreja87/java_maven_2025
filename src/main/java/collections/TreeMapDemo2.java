package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> employeeId = new TreeMap<Integer, String>();
		
		employeeId.put(5, "Manager");
		employeeId.put(15, "Supervisor");
		employeeId.put(10, "Associate");
		
		System.out.println(employeeId);
		
	}

}
