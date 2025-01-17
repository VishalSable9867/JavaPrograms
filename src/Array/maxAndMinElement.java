package Array;

public class maxAndMinElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,5,10,50,9,8};
		int max=a[0];
		int min=a[0];
     for(int i=1; i<a.length; i++)
		{
			if(max < a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		for(int j=1; j<a.length; j++)
		{
			if(min > a[j])
			{
				min=a[j];
			}
		}
		System.out.println(min);

	}

}
