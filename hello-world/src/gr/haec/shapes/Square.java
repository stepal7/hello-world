package gr.haec.shapes;

//����� Square
public class Square {
	double side;
		//������� constructor
	public Square(double s){
		side=s;
	}
		//����������� �������
	double calcArea(){
		double E=side*side;
		return E;
	}
		//�������� �������
	void printArea(){
		System.out.println(calcArea());
	}	
	
	public static void main(String[]args){
		Square sq1=new Square(5);
		sq1.printArea();
		//System.out.println(sq1.calcArea());
	} 
	
}
