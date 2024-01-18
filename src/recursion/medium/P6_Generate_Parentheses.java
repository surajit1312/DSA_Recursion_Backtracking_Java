package recursion.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Leetcode: 22. Generate Parentheses
 * 
 * Link: https://leetcode.com/problems/generate-parentheses/description/
 * 
 * TC: O(2N) ~ O(N)
 * SC: O(2N) ~ O(N)
 */
public class P6_Generate_Parentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> parenthesis = generateParenthesis(n);
        System.out.println("List of balanced parenthesis : " + parenthesis);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        int open = 0;
        int close = 0;
        String current = "";
        parenthesisHelper(n, open, close, current, result);
        return result;
    }

    private static void parenthesisHelper(int n, int open, int close, String current, List<String> result) {
        if (open == n && close == n) {
            result.add(current);
            return;
        }
        // pick open
        if (open < n) {
            parenthesisHelper(n, open + 1, close, current + "(", result);
        }
        // pick close
        if (close < open) {
            parenthesisHelper(n, open, close + 1, current + ")", result);
        }
    }
}
