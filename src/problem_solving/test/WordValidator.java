package problem_solving.test;

public class WordValidator {	
    public static int isValidWord(String word) {
    	int count=0;
    	boolean isAlphaNumberic = true;
    	String[] strArray = word.split(" ");
    	
    	for(String str : strArray) {
    		if(str.length() > 2) {

        		if (!str.matches("[a-zA-Z0-9]+")) {
                	isAlphaNumberic = false;
                }
                
                if(isAlphaNumberic) {
                	for (char c : str.toCharArray()) {
                        if (isVowel(c)) {
                            count++;
                            break;
                        }
                    }            	
                }           
        	
    		}
    	}
        return count;
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
    	System.out.println(isValidWord("This is my laptop"));
    	System.out.println(isValidWord("This is my laptop$"));
    	System.out.println(isValidWord("This3 is my lapt#op9")); 
    	System.out.println(isValidWord("Thi2s are my laptops9"));
    }
}
