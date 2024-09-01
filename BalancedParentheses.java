import java.util.*;

public class BalancedParentheses {

    /**
     * This method checks if the parentheses in a given string are balanced.
     *  The input string containing parentheses
     *  True if the parentheses are balanced, false otherwise
     */
    public static boolean isBalanced(String s) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack
            if (c == '(' || c == '{') {
                stack.push(c);
            }
            // If the character is a closing parenthesis
            else if (c == ')' || c == '}') {
                // Check if the stack is empty (i.e., no matching opening parenthesis)
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack and check if it matches the closing parenthesis
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all parentheses were matched and balanced
        return stack.isEmpty();
    }
    

    public static void main(String[] args) {
        List<String> testCases = Arrays.asList("{()}", "({})",  "({}){}", "({[})", "(()", "({}[])", "{}()");
        
        // Loop through each test case and check if it is balanced
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isBalanced(testCase));
        }
    }
}

