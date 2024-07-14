package problem_solving.leetcode_150;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strings = {"flower","flow","flight"};
		longestCommonPrefix(strings);

	}
	
	public  static String longestCommonPrefix(String[] strs) {
        String str = "";
        Arrays.sort(strs);
        printArrayList(strs);
        
        
        return str;        
    }
	
	static void printArrayList(String[] str) {
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}

}
