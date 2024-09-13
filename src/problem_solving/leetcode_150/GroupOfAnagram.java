package problem_solving.leetcode_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfAnagram {

	public static void main(String[] args) {
		String[]  str = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(str);

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>>  list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str : strs) {
			List<String> strList;
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String word = String.valueOf(charArray);
			
			if(!map.containsKey(word)) {
				strList = new ArrayList<>();				
			}else {
				strList = map.get(word);
			}
			strList.add(str);
			map.put(word, strList);
		}
		
		for(List<String> strsList : map.values()) {
			list.add(strsList);
		}
		list = list.stream().sorted(Comparator.comparingInt(List::size)).collect(Collectors.toList());
        return list;
    }

}
