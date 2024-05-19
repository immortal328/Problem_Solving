package problem_solving.leetcode_150;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String args[]) {

		int[] nums1 = { 3, 2, 3 };
		int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };

		System.out.println("----> " + majorityElement(nums1));
		System.out.println("----> " + majorityElement(nums2));

	}

	public static int majorityElement(int[] nums) {
		int appeareNumber = nums.length / 2;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
				if (map.get(nums[i]) > appeareNumber) {
					return nums[i];
				}
			} else {
				map.put(nums[i], 1);
				if (map.get(nums[i]) > appeareNumber) {
					return nums[i];
				}
			}
		}
		return 0;

	}

}
