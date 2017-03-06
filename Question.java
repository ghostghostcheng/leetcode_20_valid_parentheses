package leetcode_20_valid_parentheses;

/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.

The brackets must close in the correct order, 
"()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

public class Question {
	public static void main(String args[]) {
		String str = "()[]{}";
		
		boolean isValid = Solution.isValid(str);
		
		System.out.print(isValid);
	}
}
