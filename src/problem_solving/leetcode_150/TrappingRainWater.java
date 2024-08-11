package problem_solving.leetcode_150;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("Trap Water is -"+trap(height));
		
		/**
		 * 0 1 0 2 1 0 1 3 2 1 2 1
		   0 1 1 2 2 2 2 3 3 3 3 3
           3 3 3 3 3 3 3 3 2 2 2 1
		 * 
		 * */

	}
	
	public static int trap(int[] height) {
        int totalWater = 0;

        int[] leftMin = new int[height.length];
        leftMin[0] = height[0];
        int[] rightMin = new int[height.length];
        rightMin[height.length-1] = height[height.length-1];

        for(int i=1;i<height.length;i++){ leftMin[i] = Math.max(height[i],leftMin[i-1]);}
        for(int i=height.length-2;i>=0;i--){ rightMin[i] = Math.max(height[i],rightMin[i+1]);}

        for(int i=0;i<height.length;i++){
            totalWater += (Math.min(leftMin[i],rightMin[i])-height[i]);
        }
        return totalWater;        
    }

}
