package Array;

public class sumOfElement {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,80,70};
		int sum1=0;
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		for(int x:a)
		{
			sum1=sum1 + x;
		}
		System.out.println(sum1);

	}

}
