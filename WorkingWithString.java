package week3.day1;

public class WorkingWithString {

	public static void main(String[] args) {
		// String literal
		String str1 = "TestLeaf";// Literal
		String str2 = new String("TestLeaf");// Object-This will store in Heap Memory
		String str3 = "TestLeaf";// Same value of String will pointing str1
		// Validate both strings are equal
		if (str1 == str3) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		// Compare the string value
		System.out.println(str1.equals(str3));
		// For ignoring Case sensitivity, compare only value
		System.out.println(str1.equalsIgnoreCase(str2));
		//To check If part of value is available in string
		System.out.println(str1.contains("Leaf"));
		//To get the Characters from String
		String s ="Welcome";//w e l c o m e
		char[] ch= new char[6];
		ch[0]='W';
		//String to Char Array
		char[] charArray = s.toCharArray();
		//to find the length of the string
		int length = s.length();
		System.out.println(charArray[length-1]);
		//get specific character
		char charAt = s.charAt(3);//c
		System.out.println(charAt);
		//substring
		System.out.println(s.substring(4));
		System.out.println(s.substring(5, 7));
		//to remove space from Leading & Trailing edge
		String S1="         Welcome       ";
		System.out.println(S1.trim());
		//Split the string
		String s2 = "Welcome to Testleaf";
		String[] split = s2.split(" ");
		System.out.println(split[2]);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]+" ");
		}
	//how to replace string
		System.out.println(s2.replace("e", "o"));
//Adding 2 string
		//Concatenation
		System.out.println(str1.concat(s2));
	}

}
