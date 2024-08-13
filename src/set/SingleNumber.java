package set;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
		System.out.println(singleNumber(new int[] {2}));
		System.out.println(singleNumber(new int[] {2,3,2}));

	}
	
	 public static int singleNumber(int[] nums) {
	        Set<Integer> set = new HashSet<>();
	        set.add(nums[0]);

	        if(nums.length == 1) {
	        	return nums[0];
	        }	            

	        for(int i=1;i<nums.length-1;i++){
	            if(!set.contains(nums[i])){
	                set.add(nums[i]);
	            }else{
	                set.remove(nums[i]);
	            }
	        }
	        
	        Object[] ob = set.toArray();
	        

	        return (int) ob[0];        
	    }

}
