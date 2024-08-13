package problem_solving.leetcode_150;

public class SingleNumber {
	// If the Other Occurrence are 2 Time
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {1,2,3,3,4,5,5,2,4}));
	}
	
	public static int singleNumber(int[] nums) {
        int XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR ^= nums[i];
        }
        return XOR;        
    }

}
