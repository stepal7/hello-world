package gr.haec.animals;

public class MainClass {
	
	
public static void main(String[] args){
	
	// Animal agkiras= new Cat(false,"whiskas","Mpoumpou",  "agkira","aspri");
	
	//menu Run-> Run Configurations-> Arguments
	Cat cat1= new Cat(false,"whiskas",args[0], "agkira",args[1]);
	
	Cat cat2= new Cat(false,"whiskas","Mpoumpou", "agkira","aspri");
	System.out.println(cat2.toString());
	
	Dog dog1=new Dog(false, "mprizola", "mitso", "diafora", "trikolore");
	
	System.out.println(dog1.toString());
	System.out.println(cat1 instanceof Cat);
	System.out.println(dog1 instanceof Dog);
	System.out.println(dog1 instanceof Animal);
}
	

}
