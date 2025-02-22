package practise_Array;

public class bubble_Sort {

	public static void main(String[] args) {
		int[] a= {90,10,50,20,30,40,800,900,5000};
		int temp=0;
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}

	}

}
