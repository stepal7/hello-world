package gr.haec.shapes;

public class Tetragono extends Shape {
	
	double side;
	
	public Tetragono(String color, double side) {
	    super(color);
	    this.side=side;
	    System.out.println("Φτιάχνω ένα τετράγωνο");
	}
	
	public void setArea() {
		System.out.println("Υπολογίζω το εμβαδό του τετραγώνου");
		area=side*side;
		System.out.println(area);
	}
	
	public void setPerimeter() {
		System.out.println("Υπολογίζω την περίμετρο του τετραγώνου");
		perimeter=4*side;
		System.out.println(perimeter);
	}
	public String toString(){
		return "Είναι ένα "+color+" τετράγωνο με πλευρά "+ side;
	}

	public static void main(String[] args) {
		Tetragono t1=new Tetragono("Κόκκινο",2);
		t1.setArea();
		t1.setPerimeter();
		System.out.println(t1);
		t1.toString();
	}

}
