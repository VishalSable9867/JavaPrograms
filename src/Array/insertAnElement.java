package Array;

public class insertAnElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,7};
		int pos = 4;
		int ele=4;
		
		for(int i=a.length-1; i > pos-1; i--)  // 5    5>3    3      4  4>3  4
		{
			a[i]=a[i-1];
		}
		a[pos-1]=ele;
		
		for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}

	}

}
