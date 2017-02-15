package gr.haec.hello;

public class MainClass {
	 
	public static void main(String[]args){
	
		/*
		Laptop newLaptop=new Laptop();
		newLaptop.setRAM(16);
		newLaptop.printRAM();
		newLaptop.addRAM(4);
		newLaptop.printRAM();
		*/
		
		//Laptop hp=new Laptop("hp","folio","intel");
		//hp.setRAM(8);	
		//hp.addRAM(8);
		//hp.printRAM();
		
		Laptop hp=new Laptop();
		hp.userInsertRam();
		//hp.addRAM(8);
		hp.printRAM();
	}
	
}
