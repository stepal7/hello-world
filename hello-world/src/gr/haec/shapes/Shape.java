package gr.haec.shapes;

public class Shape {
	double area;
	double perimeter;
	String color;
	
	public Shape(String color){
		this.color=color;
		System.out.println("������� ��� ����� �� ����� "+color);
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea() {
		System.out.println("��������� �� ������ ��� ��������");
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public void setPerimeter() {
		System.out.println("��������� ��� ��������� ��� ��������");
	}
	
	
	
	
}
