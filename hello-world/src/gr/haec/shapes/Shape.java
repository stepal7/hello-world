package gr.haec.shapes;

public class Shape {
	double area;
	double perimeter;
	String color;
	
	public Shape(String color){
		this.color=color;
		System.out.println("Φτιάχνω ένα σχήμα με χρώμα "+color);
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea() {
		System.out.println("Υπολογίζω το εμβαδό του σχήματος");
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setPerimeter() {
		System.out.println("Υπολογίζω την περίμετρο του σχήματος");
	}
	
	
	
	
}
