package practise_Array;

import java.util.Arrays;

public class delete_An_Element {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,9};
		int del=4;
		for(int i=0; i<a.length-1; i++)
		{
			if(del == a[i])
			{
				for(int j=i; j<a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int k=0; k < a.length-1; k++)
		{
			System.out.println(a[k]);
		}


	}

}
