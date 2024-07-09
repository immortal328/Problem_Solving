package problem_solving.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		lengthOfLongestSubstring(sc.nextLine());
	}
	
	public static int lengthOfLongestSubstring(String str) {
		Set<Character> charArray = new HashSet<>();
		int left = 0;
		int lengthOfLonngestSubString=0;
		
		for(int right =0;right<str.length();right++) {
			
			while(charArray.contains(str.charAt(right))) {
				charArray.remove(str.charAt(right));
				left++;
			}
			
			charArray.add(str.charAt(right));
			
			lengthOfLonngestSubString = Math.max(((right-left)+1), lengthOfLonngestSubString);
			
			
			
		}
		System.out.println(" --> "+ lengthOfLonngestSubString);
		
		return lengthOfLonngestSubString;		
	}

}
