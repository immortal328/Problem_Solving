package problem_solving.leetcode_150;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings = {"flower","flow","floight","f"};
		System.out.println(longestCommonPrefix(strings));
	}
	
	public  static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];  
        for(int i=1;i<strs.length;i++) {
        	while(strs[i].indexOf(prefix) == -1) {
        		prefix = prefix.substring(0, prefix.length()-1);
        	}
        }
        return prefix;
	}
	
}
