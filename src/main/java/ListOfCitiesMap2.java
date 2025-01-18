

import java.util.ArrayList;
import java.util.List;

public class ListOfCitiesMap2 {

	public static void main(String[] args) {

		List<String> listOfCities = new ArrayList<>(); // Empty list of cities

		listOfCities.add("London");
		listOfCities.add("Paris");
		listOfCities.add("New York");
		listOfCities.add("Pune");
		listOfCities.add("Bangalore");
		listOfCities.add("Hyderabad");
		listOfCities.add("Mumbai");
		listOfCities.add("Delhi");
		listOfCities.add("Surat");
		listOfCities.add("Chennai");
		listOfCities.add("Goa");

		System.out.println(listOfCities);
		System.out.println(listOfCities.size());

		listOfCities.addFirst("Indore");
		System.out.println(listOfCities);

		listOfCities.addLast("Colombo");
		System.out.println(listOfCities);

		System.out.println(listOfCities.get(5));

		System.out.println(listOfCities.indexOf("Chennai"));

		listOfCities.remove(7);

		System.out.println(listOfCities);

		listOfCities.remove("Colombo");
		System.out.println(listOfCities);

		listOfCities.set(2, "Colombo");
		System.out.println(listOfCities);

		listOfCities.add("Delhi");
		System.out.println(listOfCities);

		// List allows duplicate values

		for (String city : listOfCities) { //Iterate over all cities in the list
			System.out.println(city);
		}

	}

}
