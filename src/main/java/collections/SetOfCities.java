package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOfCities {

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

		System.out.println(setOfCities);
		System.out.println(setOfCities.size());

		setOfCities.add("Indore");
		System.out.println(setOfCities);

		setOfCities.add("Colombo");
		System.out.println(setOfCities);




		
		setOfCities.remove(7);
		
		
		
		System.out.println(setOfCities);
		
		setOfCities.remove("Colombo");
		System.out.println(setOfCities);
		
		
		System.out.println(setOfCities);
		
		
		setOfCities.add("Delhi");
		System.out.println(setOfCities);
		
		//Set does not allows duplicate values
		//Order of insertion of elements is not preserved
		
		
		
	}

}
