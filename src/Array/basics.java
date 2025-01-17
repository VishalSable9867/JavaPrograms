package Array;

public class basics {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[][]= {{10,20,30},{80,70,50}};
//		for( int i=0; i<a.length-1; i++) 
//		{
//			System.out.println(a[i]);
//		}
		
//		for(int j=0; j< b.length; j++)
//		{
//			for(int k=0; k<b[j].length ; k++)
//			{
//				System.out.println(b[j][k]);
//			}
//		}
//		
		// print two dimensional array using for each loop
		for(int[] x:b)
		{
			for(int v:x)
			{
				System.out.println(v);
			}
		}
		
		for(int d: a)
		{
			System.out.println(d);
		}
	}

}
