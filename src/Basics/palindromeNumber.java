package Basics;

public class palindromeNumber {

	public static void main(String[] args) {
		int a=164;
		int rev=0;
		int b=a;
		
		while(a != 0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		if(b == rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}

	}

}
