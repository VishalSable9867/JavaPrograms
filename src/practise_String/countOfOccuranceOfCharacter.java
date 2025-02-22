package practise_String;

import java.util.*;

public class countOfOccuranceOfCharacter {

	public static void main(String[] args) {
		String s1= "VVVVIISSHHHHAAALLL";
		s1=s1.toLowerCase();
		HashMap<Character,Integer> md = new HashMap<>();
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch != ' ')
			{
				md.put(ch,md.getOrDefault(ch,0)+1);
			}
		}
		for(char x:md.keySet())
		{
			System.out.println("Occurance of"+ " "+x +" "+"charcter is:"+md.get(x));
		}

	}

}
