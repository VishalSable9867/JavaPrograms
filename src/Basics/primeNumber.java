package Basics;

public class primeNumber {

	public static void main(String[] args) {
		int a=9;
		int count=0;
		if(a >1)
		{
			for(int i=1; i<=a; i++)
			{
				if(a%i==0)
					count++;
			}
				if(count==2)
				{
					System.out.println("Prime");
				}
				else
				{
					System.out.println("not Prime");
				}
			}
		else
		{
			System.out.println("Not applicable");
		}

	}

}
