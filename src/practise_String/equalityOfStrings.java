package practise_String;

public class equalityOfStrings {

	public static void main(String[] args) {
		String s1="Vishal";
		String s2="Vishal";
		
		if(s1.length() == s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i)== s2.charAt(i))
				{
					System.out.println("Strings are Equal"+ s1.charAt(i));
				}
				else
				{
					System.out.println("Strings are not Equal"+s1.charAt(i)+" and"+s2.charAt(i));
				}
			}
		}
		else
		{
			System.out.println("Length are not same ");
		}

	}

}
