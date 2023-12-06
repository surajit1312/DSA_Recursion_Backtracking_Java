/**
 * 
 */
package recursion.hard;

import java.util.ArrayList;

/**
 * 
 * CodingNinjas: Generate all parenthesis
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/generate-all-parenthesis_571
 * https://www.codingninjas.com/studio/problems/generate-all-parenthesis_920445
 * 
 * TC: O(2^n * n)
 * SC: O(2n * x, where x = length of valid parenthesis)
 * 
 */
public class P1_Generate_All_Parenthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		printWellFormedParanthesis(n);
	}

	private static void printWellFormedParanthesis(int n) {
		int open = 0, closed = 0;
		ArrayList<String> result = new ArrayList<String>();
		parenthesisHelper(n, open, closed, "", result);
		System.out.println("List of valid parenthesis are : " + result);
	}

	private static void parenthesisHelper(int n, int open, int closed, String current, ArrayList<String> result) {
		// Base condition
		if (open == n && closed == n) {
			result.add(current);
			return;
		}

		// Add open parenthesis
		if (open < n) {
			parenthesisHelper(n, open + 1, closed, current + "(", result);
		}

		// Add closed parenthesis
		if (closed < open) {
			parenthesisHelper(n, open, closed + 1, current + ")", result);
		}
	}

}
