package String;

public class practice {
	public static void main(String[] args)
	{
		String s1= "Hi i am Om Kangane";
		String s2= "HI i am Om Kangane";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.charAt(5));
		char[] s3=s1.toCharArray();
		System.out.println(s3);
		System.out.println(s1.contains(s2));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.subSequence(5, 15));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,15));
		System.out.println(s1.replace("i","then"));
		System.out.println(s1.replaceFirst("i", "then"));
		System.out.println(s1.replaceAll("i", "Done"));
		
		StringBuffer bf = new StringBuffer("Hello");
		System.out.println(bf);
		System.out.println(bf.append("Done"));
		System.out.println(bf.capacity());
		System.out.println(bf.reverse());
		System.out.println(bf.insert(5, "XX"));
		System.out.println(bf.delete(4,5));
		System.out.println(bf.deleteCharAt(4));
	}

}
