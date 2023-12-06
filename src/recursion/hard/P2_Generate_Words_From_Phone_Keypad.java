/**
 * 
 */
package recursion.hard;

import java.util.ArrayList;

/**
 * GeeksForGeeks: Possible Words From Phone Digits
 * 
 * Link:
 * https://practice.geeksforgeeks.org/problems/possible-words-from-phone-digits-1587115620/1
 * 
 * TC: O(4^n x n)
 * SC: O(n)
 * 
 */
public class P2_Generate_Words_From_Phone_Keypad {

	@SuppressWarnings("unchecked")
	private static ArrayList<String>[] keys = new ArrayList[10];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new ArrayList<String>();
		}
		keys[2].add("a");
		keys[2].add("b");
		keys[2].add("c");

		keys[3].add("d");
		keys[3].add("e");
		keys[3].add("f");

		keys[4].add("g");
		keys[4].add("h");
		keys[4].add("i");

		keys[5].add("j");
		keys[5].add("k");
		keys[5].add("l");

		keys[6].add("m");
		keys[6].add("n");
		keys[6].add("o");

		keys[7].add("p");
		keys[7].add("q");
		keys[7].add("r");
		keys[7].add("s");

		keys[8].add("t");
		keys[8].add("u");
		keys[8].add("v");

		keys[9].add("w");
		keys[9].add("x");
		keys[9].add("y");
		keys[9].add("z");
		String sequence = "234";
		ArrayList<String> result = possibleWords(sequence, sequence.length());
		System.out.println(result);
	}

	public static ArrayList<String> possibleWords(String Sequence, int N) {
		ArrayList<String> result = new ArrayList<String>();
		String[] nums = Sequence.split("");
		phoneCodeHelper(nums, N, "", result, 0);
		return result;
	}

	private static void phoneCodeHelper(String[] nums, int N, String current, ArrayList<String> result, int index) {
		if (index == N) {
			result.add(current);
			return;
		}
		int ind = Integer.parseInt(nums[index]);
		ArrayList<String> numKeys = keys[ind];
		for (String str : numKeys) {
			phoneCodeHelper(nums, N, current + str, result, index + 1);
		}
	}

}
