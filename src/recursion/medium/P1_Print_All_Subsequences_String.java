/**
 * 
 */
package recursion.medium;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * CodingNinjas: Subsequences of String
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/subsequences-of-string_985087
 * https://www.codingninjas.com/studio/problems/print-subsequences_8416366
 * 
 * TC: O(2^n)
 * SC: O(2^n)
 * 
 */
public class P1_Print_All_Subsequences_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> powerset = subsequences(str);
		System.out.println("All sub-sequences of " + str + " are : " + powerset);
	}

	private static ArrayList<String> subsequences(String str) {
		ArrayList<String> result = new ArrayList<String>();
		powerSetHelper(str, "", 0, result);
		Collections.sort(result);
		return result;
	}

	private static void powerSetHelper(String str, String current, int index, ArrayList<String> result) {
		if (index == str.length()) {
			if (current != "") {
				result.add(current);
			}
			return;
		}
		// Take
		powerSetHelper(str, current + str.charAt(index), index + 1, result);

		// Not Take
		powerSetHelper(str, current, index + 1, result);
	}

}
