package String;

public class equality {

	public static void main(String[] args) {
	 
		String s1="Vishal";
		String s2="VahsiV";
		
		if(s1.length() == s2.length())
		{
			for(int i=0; i<s1.length(); i++)
			{
				if(s1.charAt(i) == s2.charAt(i))
				{
					System.out.println("Charatcer at "+ i+" is same :"+ s1.charAt(i));
				}
				else
				{
					System.out.println("Character at "+i+" Is different :"+ s1.charAt(i)+ " And "+ s2.charAt(i));
				}
			}
		}
		else
		{
			System.out.println("Length is not same");
		}
	}

}
