package problem_solving.leetcode_150;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

	}
	
	public static  int lengthOfLongestSubstring(String s) {
        int maxLength =0;
        Set<Character>  set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
            	set.add(s.charAt(i));
            	
            	if(set.size() > maxLength) {
            		maxLength = set.size();            		
            	}
            }else {
            	set.clear();
            	
            }
        }
        return maxLength;        
    }

}
