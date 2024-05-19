package problem_solving.leetcode_150;
import java.util.*;

/*
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

public class RemoveDuplicatesfromSortedArray {
    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(" ----> "+k);
    }

    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j = 0;

        while(j<nums.length){
            if(nums[i] != nums[j]){
                nums[++i]=nums[j++];
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return ++i;

    }
}
