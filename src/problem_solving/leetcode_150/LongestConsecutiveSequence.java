package problem_solving.leetcode_150;

import java.util.Arrays;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {100,4,200,1,3,2};
		//longestConsecutive(nums);
		int[] num1 = {0,3,7,2,5,8,4,6,0,1};
		longestConsecutive(num1);

	}

	public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxCons=0;

        int count = 1;
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i] == nums[i+1]-1){
                count++;
            }else{
                maxCons = Math.max(count,maxCons);
                count=1;
            }
        }
        return maxCons;
    }

}
