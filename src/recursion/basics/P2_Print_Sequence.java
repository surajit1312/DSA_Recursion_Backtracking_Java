/**
 * 
 */
package recursion.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Print a sequence of numbers starting with N, without using loop, where
 * replace N with N - 5, until N > 0. After that replace N with N + 5 until N
 * regains its initial value.
 * 
 * Example:
 * 
 * Input: N = 16 Output: 16 11 6 1 -4 1 6 11 16
 * 
 * Explanation: The value decreases until it is greater than 0.
 * After that it increases and stops when it becomes 16 again.
 * 
 * Link:
 * https://practice.geeksforgeeks.org/problems/print-pattern3549/1?page=1&difficulty[]=-2
 * 
 */
public class P2_Print_Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 16;
		List<Integer> list = pattern(N);
		System.out.println(list);
	}

	public static List<Integer> pattern(int N) {
		List<Integer> result = new ArrayList<Integer>();
		patternHelper(N, result);
		return result;
	}

	private static void patternHelper(int N, List<Integer> result) {
		result.add(N);
		if (N <= 0) {
			return;
		}
		patternHelper(N - 5, result);
		result.add(N);
	}

}
