package OOP_Concepts.Inheritance.Single_Level.Animal;

public class Animal {
	String name;
	String species;
	
	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}
	public void display() {
		System.out.println("Name = " +name);
		System.out.println("Species = " +species);
	}
}
