package gr.haec.animals;

public class Fish extends Animal {
	private boolean saltwater;
	
	public Fish(boolean isVeg, String eats, String name, boolean saltwater) {
		// TODO Auto-generated constructor stub
		super(isVeg, eats, name);
		this.saltwater = saltwater;
	}

}
