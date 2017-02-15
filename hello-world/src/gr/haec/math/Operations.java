package gr.haec.math;

public class Operations {
	double number1, number2;
	int v1;
	
	public Operations(double n1,double n2){
		number1=n1;
		number2=n2;
	}
	
	public Operations(){
		
	}
	
	double sum(){
		double z=number1+number2;
    	return z;
	}
	
	public double sum(double x,double y){
		double s=x+y;
		return s;
	}

	/** ������� ���� �������, ��������� ����� ���� �������� 
	 * ��� ��������� ����� ����������� �� �� 3 � �� 5 
	 * @param lim
	 * @return �������� 
	 */
	
	int sum35(int lim){
		int athroisma=0;
		for(int i=0;i<lim;i++)
		{
			if ((i%3==0)||(i%5==0))
				athroisma=athroisma+i;
		}
		return athroisma;
	}
	/**
	 * ������� �������, ������� ��� ���������� �� � ������� ����� ������ 
	 * @param k ��������
	 * @return true �� ����� ������, ������ false
	 */
	boolean isEven(int k){
		if (k%2==0) return true;
		else return false;
		}
	
	/**������� ������ ��� ������� �� ������� ��� �� �������� ��������
	 *
	 * @param array ������� ��������
	 */
	void minMax(int array[]){
		int min=array[0];
		int max=array[0];
		for (int i=0;i<array.length;i++){
			if (min>array[i])
				min=array[i];
			else if (max<array[i])
				max=array[i];
		}
		String s1="���������: "+min;
		String s2="��������: "+max;
		System.out.println(s1);
		System.out.println(s2);
		}
	
	
	public static void main(String[]args){
		
		//Operations newOp=new Operations(2.5 , 1.1);
		//double x=newOp.sum();
		Operations k=new Operations();
		System.out.println(k.isEven(5));
		
		System.out.println(k.sum35(1000));
		//System.out.println(newOp.number1);

		int [] pinakas={3, -1, 6, 15,9};
		k.minMax(pinakas);
		
		/* ������������� �������
		double x,y,z,ans;
		x=100;
		y=50;
		z=25;
		ans=x*x+y*y/(2*x*y);
		String message="To ���������� ����� ";
		System.out.println(message+ans);
	*/
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}
	
}
