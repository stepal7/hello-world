package gr.haec.shapes;

public class Tetragono extends Shape {
	
	double side;
	
	public Tetragono(String color, double side) {
	    super(color);
	    this.side=side;
	    System.out.println("������� ��� ���������");
	}
	
	public void setArea() {
		System.out.println("��������� �� ������ ��� ����������");
		area=side*side;
		System.out.println(area);
	}
	
	public void setPerimeter() {
		System.out.println("��������� ��� ��������� ��� ����������");
		perimeter=4*side;
		System.out.println(perimeter);
	}
	public String toString(){
		return "����� ��� "+color+" ��������� �� ������ "+ side;
	}

	public static void main(String[] args) {
		Tetragono t1=new Tetragono("�������",2);
		t1.setArea();
		t1.setPerimeter();
		System.out.println(t1);
		t1.toString();
	}

}
