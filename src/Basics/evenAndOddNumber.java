package Basics;

public class evenAndOddNumber {

	public static void main(String[] args) {
		int a=123456789;
		int even_count=0;
		int odd_count=0;
		
	while( a > 0)
	{
		int b=a%10;
		
		if(a%2 == 0)
		{
			even_count++;
		}
		else
		{
			odd_count++;
		}
		a=a/10;
	}
	System.out.println(even_count);
	System.out.println(odd_count);

	}

}
