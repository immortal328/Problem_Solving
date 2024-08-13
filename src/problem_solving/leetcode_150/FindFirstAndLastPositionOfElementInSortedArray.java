package problem_solving.leetcode_150;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int[] arrr = searchRange(arr,8);
		
		for(int i : arrr) {
			System.out.print(i+" ");			
		}

	}
	
	public static int[] searchRange(int[] nums, int target) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            List<Integer> list;
            if(!map.containsKey(nums[i])){
                list = new LinkedList<>();
            }else{
                list = map.get(nums[i]);
            }
            list.add(i);
            map.put(nums[i], list);
        }

        if(map.containsKey(target)){
            return new int[]{map.get(target).get(0),map.get(target).get(map.get(target).size()-1)};
        }
        return new int[]{-1,-1};
    }

}
