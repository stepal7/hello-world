package gr.haec.hello;

public class Loops {
	
	public static void main(String[]args){
	/*
		int x = 0;
	//while loop
		while (x<10){
			
			System.out.println(x);
			x++;
		}
	
	//do...while loop	
	 x=0;
		do {
			System.out.println(x);
			x=x+1;
		    } while (x<10); 
	
	//for loop	
		for(x=0;x<10;x++){
		System.out.println(x);
	}
		
		for (int z=0,y=10;(z<10)&&(y>5);z++,y--){
			System.out.println("z="+z+" y="+y);
		}
		*/
	
	// print values of array
	/*	int [] array={2,4,6,8,10};
		for (int i=0;i<5;i++){
			System.out.println("array["+i+"]="+array[i]);
			
		}
		*/
		int [] array={2,4,6,8,10};
		for (int i=0;i<5;i++){
			if (array[i]<5)
				System.out.println(array[i]);
			else if ((array[i]>5)&&(array[i]<8))
				System.out.println(array[i]*array[i]);
			else 
				System.out.println(array[i]*array[i]*array[i]);}
		}
	}
	


