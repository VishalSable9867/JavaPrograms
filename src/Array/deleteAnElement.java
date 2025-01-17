package Array;

public class deleteAnElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int delele=4;
		
		for(int i=0; i<a.length; i++)
		{
			if(delele== a[i])
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
