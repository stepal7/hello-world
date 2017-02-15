package gr.haec.animals;

public class Cat extends Mammal {
	private String breed;
	private String color;
	
	public Cat(boolean isVeg, String eats, String name,  String breed, String color) {
		super(isVeg, eats, name, 4);
		this.breed=breed;
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return "Είναι γάτα "+breed+" τρώει "+getEats()+" λέγεται "+getName()+" είναι χρώματος "+color;
	}



}
