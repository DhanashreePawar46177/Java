package OOP_Concepts.Inheritance.Single_Level.Vehicle;

public class Car extends Vehicle{
	String brand;
	int carNo;
	
	public Car(String brand,int carNo){
		super("Abc");
		this.brand = brand;
		this.carNo = carNo;
	}
	
	public void display() {
		System.out.println("Brand = " +brand);
		System.out.println("Car Number = " +carNo);
		System.out.println("Type = " +type);
	}
}
