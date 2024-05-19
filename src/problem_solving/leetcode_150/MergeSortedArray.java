package problem_solving.leetcode_150;
import java.util.Arrays;

/*
 * 
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/

public class MergeSortedArray{
    public static void main(String args[]){
        //Example 1 :
        int[] exmaple1Nums1 ={1,2,3,0,0,0};
        int[] exmaple1Nums2 ={2,5,6};
        merge(exmaple1Nums1,3,exmaple1Nums2,3);

        //Example 2 :
        int[]  exmaple2Nums1 ={1};
        int[]  exmaple2Nums2 ={};
        merge(exmaple2Nums1,1,exmaple2Nums2,0);

       //Example 3 :
        int[]  exmaple3Nums1 ={0};
        int[]  exmaple3Nums2 ={1};
        merge(exmaple3Nums1,0,exmaple3Nums2,1);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
        }else{
            for(int i=0;i<n;i++){
                nums1[m++]=nums2[i];
            }
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if (nums1[i]>nums1[j]) {
                    int temp = nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
  }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] newNums = new int[m+n];
        int i=0; int j=0;int k=0;
        if(m==0 || n==0){
            if(m==0){
                while(k<n){newNums[i++]=nums2[k++];}
            }else{
                while(j<m){newNums[i++]=nums1[j++];}
            }
        }else{
            while(j<m || k<n){
                if(nums1[j]<=nums2[k]  && j<m){
                    newNums[i++]=nums1[j++];
                }else{
                    newNums[i++]=nums2[k++];
                }                
            }
        }
        System.out.println(Arrays.toString(newNums));
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     //2
        int j = n - 1;     //2
        int k = m + n - 1; //5

        while (j >= 0){        
        if (i >= 0 && nums1[i] > nums2[j]){
            nums1[k--] = nums1[i--];
        }else{
            nums1[k--] = nums2[j--];
        }        
        }    
        System.out.println(Arrays.toString(nums1));
    }
} 


