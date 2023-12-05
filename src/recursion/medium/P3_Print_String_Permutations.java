/**
 * 
 */
package recursion.medium;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * GeeksForGeeks: String Permutations
 *
 * Link:
 * https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1
 * 
 * TC: O(n! x n)
 * SC: O(n)
 * 
 */
public class P3_Print_String_Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String S = "ABC";
		ArrayList<String> result = permutation(S);
		System.out.println("All possible permutations of " + S + " is: " + result);
	}

	private static ArrayList<String> permutation(String S) {
		ArrayList<String> result = new ArrayList<String>();
		permutationHelper(S, 0, result);
		Collections.sort(result);
		return result;
	}

	private static void permutationHelper(String str, int index, ArrayList<String> result) {
		if (index == str.length()) {
			result.add(str);
		}
		for (int i = index; i < str.length(); i++) {
			str = new String(swap(str, index, i));
			permutationHelper(str, index + 1, result);
			str = new String(swap(str, index, i));
		}
	}

	private static char[] swap(String s, int a, int b) {
		char[] charArr = s.toCharArray();
		char temp = charArr[b];
		charArr[b] = charArr[a];
		charArr[a] = temp;
		return charArr;
	}

}
