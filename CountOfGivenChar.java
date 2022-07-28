package week3.day1;

public class CountOfGivenChar {

	public static void main(String[] args) {
		String input="TestLeaf";
		int count=0;
		char[] charArray = input.toCharArray();
		int length = input.length();
		System.out.println("Length of given Input is = "+length);
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='e') {
				count++;
							}
			
		}
		System.out.println("Given Character Repeating "+ count+" times");
		}

}
