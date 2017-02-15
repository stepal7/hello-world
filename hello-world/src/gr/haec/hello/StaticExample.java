package gr.haec.hello;

public class StaticExample {
	static int count;
	//static η μεταβλητή ανήκει στην κλάση και όχι στο instance
	
	public StaticExample(int count){
		this.count=count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//static μέθοδος
	static void printCount(){
		System.out.println(count);
	}
	
	public static void main(String[]args){
		StaticExample ex1=new StaticExample(4);
		StaticExample ex2=new StaticExample(10);
		StaticExample ex3=new StaticExample(-2);
		
		//ex1.printCount();
		StaticExample.printCount();
	
	}
	
}
