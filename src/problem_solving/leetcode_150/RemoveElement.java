package problem_solving.leetcode_150;
import java.util.Arrays;

public class RemoveElement {
    public static void main(){

        //Example : 1
        int[] nums = {3,2,2,3};
        removeElement(nums, 3);

        //Example : 2
        int[] nums1 = {0,1,2,2,3,0,4,2};
        removeElement(nums1, 2);   
    }

    public static int removeElement(int[] nums, int val) {
        int index =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
    
}
