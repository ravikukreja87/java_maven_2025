package cars;

public class Car {

	// Functions/Methods

	// Attrs/Properties

	public Car(int engineCapacity) {
		if (engineCapacity <= 600) {
			System.out.println("Please create a car object with valid engineCapacity");
		}
		this.engineCapacity = engineCapacity;
	}

	public void accelerate() {
		System.out.println(make + " " + model + " Car is accelerating");
	}

	public void applyBrakes() {
		System.out.println(make + " " + model + " Car is applying brakes");
	}

	public void startIgnition() {
		System.out.println("Ignition Started for " + make + " " + model);
	}

	public void getEngineCapacity() {
		System.out.println("Engine capatity of " + make + " " + model + " is = " + engineCapacity);
	}

	public void getCarColor() {
		System.out.println("Color of " + make + " " + model + " is = " + color);
	}

	public String make;
	public String model;
	public String color;
	public int engineCapacity; // Class Field
	public int seatingCapacity;
	public int numberOfAirBags;

}
