package Array;

public class evenAndOdd {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,8,7,9,4,5,6};
		
		for(int i=0; i<= x.length-1; i++)
		{
			if(x[i]%2 == 0)
			{
				System.out.println("Even number is: " +x[i]);
			}
		}
		
		System.out.println("=========================================================");
		
		for(int j=0; j<= x.length-1; j++)
		{
			if(x[j]%2 != 0)
			{
				System.out.println("Odd number is: " +x[j]);
			}
		}

	}

}
