package problem_solving.leetcode_150;

public class ValidWordChecker {

    public static boolean isValidWord(String word) {
        // Check if the word is not null and not empty
        if (word == null || word.isEmpty()) {
            return false;
        }
        
        // Check each character in the word
        for (char c : word.toCharArray()) {
            // If the character is not a letter or digit, return false
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        
        // If all characters are alphanumeric, return true
        return true;
    }

    public static void main(String[] args) {
        String[] testWords = {"hello123", "test_word", "Valid123", "Invalid!", "12345"};

        for (String word : testWords) {
            boolean isValid = isValidWord(word);
            System.out.println("Is the word \"" + word + "\" valid? " + isValid);
        }
    }
}
