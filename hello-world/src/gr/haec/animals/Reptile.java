package gr.haec.animals;
 
public class Reptile extends Animal{
  private boolean isPoisonous;
	public Reptile(boolean isVeg, String eats, String name,boolean isPoisonous) {
		super(isVeg, eats, name);
		this.isPoisonous = isPoisonous;
		// TODO Auto-generated constructor stub
	}

}
