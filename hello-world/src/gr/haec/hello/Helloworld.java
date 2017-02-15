package gr.haec.hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Helloworld {
	
	public static void main(String[] args){
		//String s="Hello World";
		System.out.println("Hello World");	//print
	//το αρχείο μπορεί να μην υπάρχει, γι αυτό μπορεί να χτυπάει exception
	// με το try-catch συνεχίζεται η ροή του προγράμματος (checked exception)
	try{ File f=new File("C:\tmp.txt");
		FileReader fr=new FileReader(f);
		
	//unchecked exception
	
	int[] pinakas={1,2,3};
	System.out.println(pinakas[10]);
		}
	catch( FileNotFoundException e){
		//catch-block code
	e.printStackTrace();
		}
	catch(java.lang.ArrayIndexOutOfBoundsException e){
		//System.out.println("Ο πίνακας έχει 3 θέσεις");
		System.err.println("Ο πίνακας έχει 3 θέσεις");	
		}
	finally{
		
	}
	}
}
	

