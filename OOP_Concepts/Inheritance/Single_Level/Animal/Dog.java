package OOP_Concepts.Inheritance.Single_Level.Animal;

public class Dog extends Animal{
	int id;
	String breed;
	
	public Dog(int id, String breed) {
		super("Abc", "Lmn");
		this.id = id;
		this.breed = breed;
	}
	
	public void display() {
		System.out.println("Id = " +id);
		System.out.println("Breed = " +breed);
	}
}
