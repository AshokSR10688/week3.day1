package week3.day1;

public class WorkingWithArray {

	public static void main(String[] args) {
	int[] input = {23,34,56,78,78,23};
	int count=0;
	for (int i = 0; i < input.length; i++) {
		if (input[i]==78) {
			count++;
		}
	}
System.out.println("The count of 78 is "+count);
	}

}
