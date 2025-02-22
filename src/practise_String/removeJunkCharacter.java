package practise_String;

public class removeJunkCharacter {
	public static void main(String[] args)
	{
		String s1="!##Vi&**(shal";
		StringBuilder sd = new StringBuilder();
		for(int i=0; i<s1.length(); i++)
		{
			char s2=s1.charAt(i);
			
			if(Character.isLetterOrDigit(s2))
			{
				sd.append(s2);
			}
		}
		System.out.println("Filter String is :"+ sd.toString());
	}

}
