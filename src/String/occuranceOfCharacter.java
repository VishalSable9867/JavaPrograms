package String;

public class occuranceOfCharacter {

	public static void main(String[] args) {
		String s1= "test test tes test";
		
		int a= s1.length();
		
		String s2= s1.replaceAll("s", "");
		
		int b= s2.length();
		
		int c=a-b;
		System.out.println(c);
		// 2nd logic
		
		char target = 't';
		int count=0;
		
		for(int i=0; i< s1.length(); i++)
		{
			if(s1.charAt(i) == target)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
