package cars;

public class Factory {

	public static void main(String[] args) {

		// Create cars

		// Cars can be created based on model class Car. Concept is their in class Car

		// Create an object of Car class
		Car audi = new Car(3000); // audi object is created/constructe based on model/concept class Car
		audi.color = "black";
		audi.make = "Audi";
		audi.model = "A8";
		audi.seatingCapacity = 7;
		audi.numberOfAirBags = 6;
		audi.startIgnition();
		audi.accelerate();
		audi.applyBrakes();
		audi.getEngineCapacity();

		Car maruti800 = new Car(800);
		maruti800.color = "white";
		maruti800.make = "Suzuki";
		maruti800.model = "800";
		maruti800.seatingCapacity = 4;
		maruti800.startIgnition();
		maruti800.accelerate();
		maruti800.applyBrakes();
		maruti800.getEngineCapacity();
		maruti800.getCarColor();

		// ClassName ObjectName = new (reserves memory in java heap) Car() means
		// constructor of class Car
		// Constructor --> Class name followed by ()

		// I have to provide engineCapacity as soon as I create a car. No car should be
		// created without engineCapacity
		Car ford = new Car(1200); // Creating a car with data value 1200 in parameter of constructor
		ford.make = "Ford";
		ford.model = "Fiesta";
		ford.getEngineCapacity();

		// We are ensuring car object cannot be created without engineCapacity
		Car bmw = new Car(2400);
		bmw.make = "BMW";
		bmw.model = "E Series";
		bmw.getEngineCapacity();

		Car hyundai = new Car(0);
		hyundai.make = "Hyundai";
		hyundai.model = "i10";
		hyundai.getEngineCapacity();

	}

}
