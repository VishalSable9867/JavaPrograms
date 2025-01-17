package practise;

import java.util.Scanner;

public class Wrapper_Class {

	public static void main(String[] args) {
		int a=100;
		boolean b = true;
		char c = 'j';
		float f = 10.05f;
		double d = 10.584;
		//Converting primittive to object is known as Autoboxing.
		
		String s1= String.valueOf(a);
		String s2= String.valueOf(b);
		String s3= String.valueOf(f);
		String s4=String.valueOf(d);
		String s5 = String.valueOf(c);   //Char to String is possible
		
	    Integer x= a;
	    Boolean y=b;
	    Character z= c;
	    Float w= f;
	    Double v = d;
	    
	    int e=Integer.parseInt(s1);    // String object to primittive
	    int g=x.intValue();
	    boolean h = Boolean.parseBoolean(s5);
	    boolean i = y.booleanValue();
	    float o = Float.parseFloat(s3);
	    float p = w.floatValue();
	    double t = Double.parseDouble(s4);
	    double r = v.doubleValue();
	    
	}

}
