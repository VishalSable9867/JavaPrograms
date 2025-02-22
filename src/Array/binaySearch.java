package Array;

public class binaySearch {

	public static void main(String[] args) {
		int[] a = {10,50,80,12,78,1,2,3,4,5};
		int ele=12;
		
		for(int i=0; i < a.length; i++)
		{
			if(ele== a[i])
			{
				System.out.println("Element is found and it is at index no :" +i);
			}
		}
		System.out.println(a.length);
		
		System.out.println("=========================");
		for(int k=0; k < a.length; k++)
		{
			System.out.println(a[k]);
		}
	}

}
