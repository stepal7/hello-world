package gr.haec.hello;
import gr.haec.math.Operations;
import java.util.Scanner;

public class Laptop {
 String manufacturer, model,cpu="intel";
 int ram=0;
 float hddCapacity;
 boolean hdd_ssd=false,has_DVD;
 	
 	public Laptop(String manufacturer, String model, String cpu) {
	// TODO Auto-generated constructor stub
 		this.manufacturer=manufacturer;
 		this.model=model;
 		this.cpu=cpu;
 	}
 	public Laptop(){
 		
 	}
 	
 	void userInsertRam(){
 		System.out.println("Insert laptop RAM: ");
 		Scanner userInput = new Scanner(System.in);
 		ram=userInput.nextInt();
 	}
	void setRAM(int newRam){
 		ram=newRam;
 	}
 	void printRAM(){
 		String message="H μνήμη του Laptop είναι ";
 		System.out.println(message+ram);
 	}
 	
 	void addRAM(int extraRAM){
 		Operations op=new Operations();
 	 	//casting to integer
 		ram=(int) op.sum(ram,extraRAM);
 	}
}
