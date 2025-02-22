package practise_Array;

public class equality_of_Array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,5,4,8};
		boolean flag=true;
		
		if(a.length==b.length)
		{
			for(int i=0; i<a.length-1; i++)
			{
				if(a[i] != b[i])
				{
					flag=false;
				}
			}
		}
		else
		{
			System.out.println("Arrays length is not same ");
		}

	}

}
