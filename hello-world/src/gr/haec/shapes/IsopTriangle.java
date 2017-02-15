package gr.haec.shapes;

public class IsopTriangle {

	double side;
	
	public IsopTriangle(double s){
	side=s;
	}
	
	double calcArea(){
		double h,Area;
		h=Math.sqrt(side*side-side*side/4);
		Area=h*side/2;
		return Area;
	}
	
	double getPerimeter(){
		double p;
		p=3*side;
		return p;
	}
	
	public static void main(String[]args){
		IsopTriangle tr1=new IsopTriangle(4);
		System.out.println("Area: "+tr1.calcArea());
		System.out.println("Perimeter: "+tr1.getPerimeter());
		
	}
}
