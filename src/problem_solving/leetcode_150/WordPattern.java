package problem_solving.leetcode_150;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba","dog cat cat dog"));

	}
	
	public static boolean wordPattern(String pattern, String s) {
        String [] stringArray = s.split(" ");
        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            List<Integer> list;
            if(map.containsKey(pattern.charAt(i))){
                list = map.get(pattern.charAt(i));
            }else{
                list = new LinkedList<>();
            }
            list.add(i);
            map.put(pattern.charAt(i),list);
        }

        for(List<Integer> list : map.values()){
            for(int i=1;i<list.size();i++){
                if(!stringArray[list.get(i)].equals(stringArray[list.get(i-1)])){
                    return false;
                }
            }
        }

        return true;        
    }

}
