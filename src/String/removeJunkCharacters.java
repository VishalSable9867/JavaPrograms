package String;

public class removeJunkCharacters {

	public static void main(String[] args) {
		String s1="te#$data!@*&";
		// String s2=s1.replaceAll("[^a-zA-Z0-9]","");
		//System.out.println(s2);
		        String input = "Hello!@#$ World123!!@";
		        StringBuilder cleanedString = new StringBuilder();
		        
		        // Loop through each character of the string
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            
		            // If the character is alphanumeric, append it to the result
		            if (Character.isLetterOrDigit(ch)) {
		                cleanedString.append(ch);
		            }
		        }
		        
		        // Output the cleaned string
		        System.out.println("Original String: " + input);
		        System.out.println("Cleaned String: " + cleanedString.toString());

	}

}
