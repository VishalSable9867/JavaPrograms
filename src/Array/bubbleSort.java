package Array;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int[] a = {10,50,80,12,78,1,2,3,4,5};
		
		for(int i=0; i<a.length-1; i++)          // no of passes
		{
			for(int j=0; j<a.length-1; j++)       // no of iterations
			{
				if(a[j] > a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Arrays is :" + Arrays.toString(a));

	}

}
