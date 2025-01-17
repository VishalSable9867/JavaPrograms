package String;

public class reverseOfString {

	public static void main(String[] args) {
		String s1= "Vishal";
		String rev =" ";
		
		for(int i= s1.length()-1; i >= 0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);

	}

}
