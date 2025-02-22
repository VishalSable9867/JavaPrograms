package practise_String;

public class removeWhiteSpace {

	public static void main(String[] args) {
		String s1="V  i  s h   a  l   ";
		StringBuilder sd= new StringBuilder();
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			
			if(ch != ' ')
			{
				sd.append(ch);
			}
		}
		System.out.println(sd.toString());

	}

}
