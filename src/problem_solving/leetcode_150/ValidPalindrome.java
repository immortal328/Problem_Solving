package problem_solving.leetcode_150;
public class ValidPalindrome {
    public static void main(String args[]){
        isPalindrome("A man, a plan, a canal: Panama");
    }

     public static boolean isPalindrome(String s) {
        s.replaceAll(" ", "");
        System.out.println(s.toLowerCase());
        int i=0; int j= s.length()-1;
        while(j>=i){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    
}
