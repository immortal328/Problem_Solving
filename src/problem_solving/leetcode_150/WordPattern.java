package problem_solving.leetcode_150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba","dog cat cat dog"));

	}
	
	public static boolean wordPattern(String pattern, String s) {
        String [] strArr = s.split(" ");
        String[] patterArr = pattern.split("");
        
        Map<Character, String> map = new HashMap<>();
        
        Set<String> strSet = new HashSet<>(Arrays.asList(strArr));
        Set<String> patternSet = new HashSet<>(Arrays.asList(patterArr));
   

        if(pattern.length() != strArr.length){ return false;}
        if(strSet.size() != patternSet.size()){return false;}
        
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),strArr[i]);
            }else{
                if(!(map.get(pattern.charAt(i)).equals(strArr[i]))){
                    return false;
                }
            }
        }
        return true;
    }

}
