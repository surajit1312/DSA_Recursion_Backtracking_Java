/**
 * 
 */
package recursion.medium;

import java.util.ArrayList;

/**
 * 
 * GeeksForGeeks: Permutation with Spaces
 * 
 * Link:
 * https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1
 * 
 * TC: O(2^(n - 1))
 * SC: O(2^(n - 1))
 */
public class P4_String_Permutations_With_Spaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABC";
		ArrayList<String> result = permutation(str);
		System.out.println("All possible permutations of " + str + " is: " + result);
	}

	private static ArrayList<String> permutation(String S) {
		ArrayList<String> result = new ArrayList<String>();
		String current = S.charAt(0) + "";
		permutationHelper(S, 1, current, result);
		return result;
	}

	private static void permutationHelper(String S, int index, String current, ArrayList<String> result) {
		if (index == S.length()) {
			result.add(current);
			return;
		}
		// Include
		permutationHelper(S, index + 1, current + " " + S.charAt(index), result);

		// Not include
		permutationHelper(S, index + 1, current + S.charAt(index), result);
	}

}
