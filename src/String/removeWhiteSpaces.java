package String;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		String input= "Hi i am vishal sable looking for your number       !       ";
		//String s2=input.replaceAll(" ", "");
		//System.out.println(s2);
		
		StringBuilder cleanedString = new StringBuilder();
        
		 for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            // If the character is alphanumeric, append it to the result
	            if (ch !=' ') 
	            {
	                cleanedString.append(ch);
	            }
	        }
	        
	        // Output the cleaned string
	        System.out.println("Original String: " + input);
	        System.out.println("Cleaned String: " + cleanedString.toString());

	}

}
