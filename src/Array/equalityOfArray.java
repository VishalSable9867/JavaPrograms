package Array;

public class equalityOfArray {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= {10,20,30,40,50,96};
		boolean flag = true;
		if(a.length == b.length)
		{
			for(int i=0; i< a.length; i++)
			{
				if( a[i] != b[i])
				{
					flag= false;
				}
			}
		}
		else
		{
			flag=false;
		}
		if(flag ==true)
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both the arrays are not equal");
		}

	}

}
