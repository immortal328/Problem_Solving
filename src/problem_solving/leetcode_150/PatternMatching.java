package problem_solving.leetcode_150;

import java.util.HashMap;
import java.util.Map;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean PatternMatching(String pattern, String str) {
		Map<Character,String> map = new HashMap<>();
		String[] strArray = str.split(" ");
		
		if(pattern.length() != strArray.length) {
			return false;
		}
		
		
		
		
		
		
		
		return true;
	}

}
