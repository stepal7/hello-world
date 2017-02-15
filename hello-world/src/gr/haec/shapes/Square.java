package gr.haec.shapes;

//κλάση Square
public class Square {
	double side;
		//ορισμός constructor
	public Square(double s){
		side=s;
	}
		//υπολογισμός Εμβαδού
	double calcArea(){
		double E=side*side;
		return E;
	}
		//εκτύπωση Εμβαδού
	void printArea(){
		System.out.println(calcArea());
	}	
	
	public static void main(String[]args){
		Square sq1=new Square(5);
		sq1.printArea();
		//System.out.println(sq1.calcArea());
	} 
	
}
