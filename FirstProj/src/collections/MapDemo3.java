package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {

		Map<String, Double> employeeData = new HashMap<String, Double>();
		// Name - Salary

		employeeData.put("Jon", 25000.50);
		employeeData.put("Mark", 15000.75);
		employeeData.put("Tom", 15000.75);
		employeeData.put("Jon", 24000.50);
		employeeData.put("",5000.00);
		employeeData.put("",6000.00);
		System.out.println(employeeData);
		//If you put duplicate keys in the map, the value part is overridden

	}

}
