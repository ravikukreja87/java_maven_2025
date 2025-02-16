package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfCities2Iterator {

	public static void main(String[] args) {

		Set<String> setOfCities = new HashSet<String>(); // Empty set of cities

		setOfCities.add("London");
		setOfCities.add("Paris");
		setOfCities.add("New York");
		setOfCities.add("Pune");
		setOfCities.add("Bangalore");
		setOfCities.add("Hyderabad");
		setOfCities.add("Mumbai");
		setOfCities.add("Delhi");
		setOfCities.add("Surat");
		setOfCities.add("Chennai");
		setOfCities.add("Goa");
		/*
		 * for(String city:setOfCities) { System.out.println("City = " + city); }
		 */
		// Cities not starting with P
		Iterator<String> iterator = setOfCities.iterator();
		while (iterator.hasNext()) {		//hasNext is just checking if value is there or we have reached end of set. 
			//Until there are values hasNext will return true
			String city = iterator.next();
			if (!city.startsWith("P")) {
				System.out.println(city);
			}
		}
	}
}