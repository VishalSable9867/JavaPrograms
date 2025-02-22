package String;

public class removeDuplicateChar {

	public static void main(String[] args) {
		String s1="asdfgasd";
		
		StringBuilder result= new StringBuilder();
		
		for(int i=0; i<s1.length(); i++)
		{
			char currentChar=s1.charAt(i) ;
				
			 if (result.indexOf(String.valueOf(currentChar)) == -1) {
	                result.append(currentChar); // If not, append it to the result
	            }
				
		}
		 System.out.println("String after removing duplicates: " + result.toString());

	}

}
