package week3.day1;

public class ReverseTheString {

	public static void main(String[] args) {
	String name="Ashok";
	char[] charArray = name.toCharArray();
	for (int i = charArray.length-1; i>=0; i--) {
		System.out.println(charArray[i]);
	}

	}

}
