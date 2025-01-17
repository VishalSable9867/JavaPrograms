package Array;

public class duplicateElementOfAnArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,20,10};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate Element is :" +a[i]);
				}
			}
		
		}

	}

}
