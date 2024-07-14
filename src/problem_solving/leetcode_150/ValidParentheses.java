package problem_solving.leetcode_150;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("]"));

	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && stack.isEmpty()) {
				return false;
			} else if ((s.charAt(i) == ')' && stack.peek() != '(') || (s.charAt(i) == ']' && stack.peek() != '[')
					|| (s.charAt(i) == '}' && stack.peek() != '{')) {
				return false;
			} else if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[')
					|| (s.charAt(i) == '}' && stack.peek() == '{')) {
				stack.pop();
			}
		}

		if (stack.size() == 0)
			return true;
		return false;
	}

}
