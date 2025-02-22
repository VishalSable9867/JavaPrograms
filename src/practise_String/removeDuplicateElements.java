package practise_String;

public class removeDuplicateElements {

	public static void main(String[] args) {
		String s1="VVVIIIISSSHHHHAAALLLL";
		StringBuilder sd= new StringBuilder();
		for(int i=0; i<s1.length(); i++)
		{
			char ch= s1.charAt(i);
			
			if(sd.indexOf(String.valueOf(ch))== -1)
			{
				sd.append(ch);
			}
		}
		System.out.println(sd.toString());

	}

}
