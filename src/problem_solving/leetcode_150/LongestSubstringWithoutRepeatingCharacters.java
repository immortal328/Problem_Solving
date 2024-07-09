package problem_solving.leetcode_150;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	public static  int lengthOfLongestSubstring(String s) {
        int maxLenght = 0;
        Set<Character> charSet = new HashSet<>();
        int i=0; int j=0;
        while(i<s.length() && j<s.length()){
            if(!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j++));
                maxLenght = Math.max(maxLenght,j-i);
            }else{
                charSet.remove(s.charAt(i++));
            }

        }
       return maxLenght; 
    }
}
