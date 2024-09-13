package problem_solving.leetcode_150;

import java.util.Arrays;

public class SingleNumberII {
	public static void main(String[] args) {
		// Number occurs three time.
		System.out.println("Single Number II First");
		System.out.println(singleNumberIIFirst(new int[] {1,1,1,2,2,2,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIIFirst(new int[] {1,2,2,2,3,3,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIIFirst(new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6}));
		
		System.out.println("Single Number II Second");
		System.out.println(singleNumberIISecond(new int[] {1,1,1,2,2,2,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIISecond(new int[] {1,2,2,2,3,3,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIISecond(new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6}));
		
		System.out.println("Single Number II Third");
		System.out.println(singleNumberIIThird(new int[] {1,1,1,2,2,2,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIIThird(new int[] {1,2,2,2,3,3,3,4,4,4,5,5,5}));
		System.out.println(singleNumberIIThird(new int[] {2,2,2,3,3,3,4,4,4,5,5,5,6}));
	}
	
	 public static int singleNumberIIFirst(int[] nums) {
		 int ans = 0;
		    for (int i = 0; i < 32; ++i) {
		      int sum = 0;
		      for (int num : nums) {
		    	  sum += num >> i & 1;
		      }
		      sum %= 3;
		      ans |= sum << i;
		    }
		    return ans;
	 }
	 
	 public static int singleNumberIISecond(int[] nums) {
		 Arrays.sort(nums);
		 
		 for(int i=1;i<nums.length;i+=3) {
			 if(nums[i-1] != nums[i] ) {
				 return nums[i-1];
			 }
		 }
		 return nums[nums.length-1];
		 
	 }
	 
	 public static int singleNumberIIThird(int[] nums) {
		 int ones=0;
		 int twos=0;
		 for(int num : nums) {
			 ones = ones ^ (num & ~twos);
			 twos = twos ^ (num & ~ones);
		 }	 
		 return ones;
	 }

}
