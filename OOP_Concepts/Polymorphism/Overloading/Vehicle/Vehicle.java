package OOP_Concepts.Polymorphism.Overloading.Vehicle;

public class Vehicle {
	String vehicleType;
	String brand;
	
	public void display() {
		vehicleType = "Car";
		brand = "Suzuki";
		System.out.println("Vehicle Type = " +vehicleType);
		System.out.println("Brand = " +brand);
	}
	
	public void display(String vehicleType, String brand) {
		this.vehicleType = vehicleType;
		this.brand = brand;
		System.out.println("Vehicle Type = " +vehicleType);
		System.out.println("Brand = " +brand);
	}
}
