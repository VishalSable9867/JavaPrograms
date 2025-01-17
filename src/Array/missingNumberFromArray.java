package Array;

public class missingNumberFromArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,5};
		int sum=0;
		int sum1=0;
		for(int i=1; i<=5; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		for(int j=0; j<a.length; j++)
		{
			sum1=sum1+a[j];
		}
		System.out.println(sum1);
		
		System.out.println("Missing number from above series is: "+(sum-sum1));

	}

}
