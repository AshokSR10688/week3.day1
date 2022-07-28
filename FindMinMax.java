package week3.day1;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int [] nums= {1,5,2,4,3,6,9,8,7};
	
      Arrays.sort(nums);
      int length = nums.length;
        for (int i = 0; i < nums.length; i++)
           //List all the numbers
        System.out.println(nums[i]);
        System.out.println(nums[0]+" = Min Number");
        System.out.println(nums[length - 1]+" = Max Number");
	}  

}

