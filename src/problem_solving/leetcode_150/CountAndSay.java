package problem_solving.leetcode_150;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
	
	public static String countAndSay(int n) {
		String str="";
        for(int i=1;i<=n;i++) {
        	str = countAndAdd(i,str);
        }       
        return str;        
    }

    public static String countAndAdd(int i, String str){
        String returnStr ="";
        if(i == 1) {
        	return "1";        	
        }else if(i == 2) {
        	return "11";
        }else {
        	int j = 0;
            int count = 1; 
            for(int k=1;j<str.length();k++){
                if(str.charAt(j) == str.charAt(k)){
                    count++;
                }else{
                    str+= (String.valueOf(count)+str.charAt(j));
                    count =1;
                    j = k;
                }           
            }
            str+= (String.valueOf(count)+str.charAt(j));        	
        }   
        return returnStr;
    }
}
