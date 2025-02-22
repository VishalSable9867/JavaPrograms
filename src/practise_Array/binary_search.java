package practise_Array;

public class binary_search {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		int ele=50;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]== ele)
			{
				System.out.println("Element is found:"+ele);
			}
		}

	}

}
