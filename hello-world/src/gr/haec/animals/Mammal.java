package gr.haec.animals;

public class Mammal extends Animal{
	private int feet;
	
	public Mammal(boolean isVeg, String eats, String name,int feet) {
		super(isVeg, eats, name);
		this.feet = feet;
		// TODO Auto-generated constructor stub
	}

}
