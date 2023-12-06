/**
 * 
 */
package recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * CodingNinjas: Phone Code
 * 
 * Link: https://www.codingninjas.com/studio/problems/phone-code_1230549
 * 
 * TC: O(4^n x n)
 * SC: O(n)
 * 
 */
public class P3_Phone_Code_Keypad_II {

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
		String[] wordsArr = { "used", "code", "ride", "tree", "boed" };
		ArrayList<String> Words = new ArrayList<String>(Arrays.asList(wordsArr));
		String Sequence = "2633";
		ArrayList<String> result = phoneCode(Words, Sequence, Words.size());
		System.out.println(result);
	}

	private static ArrayList<String> phoneCode(ArrayList<String> Words, String Sequence, int W) {
		ArrayList<String> result = new ArrayList<String>();
		Map<String, Integer> dictionary = new HashMap<String, Integer>();
		String[] nums = Sequence.split("");
		for (String word : Words) {
			if (!dictionary.containsKey(word)) {
				dictionary.put(word, 1);
			}
		}
		phoneCodeHelper(dictionary, nums, nums.length, "", result, 0);
		return result;
	}

	private static void phoneCodeHelper(Map<String, Integer> dictionary, String[] nums, int N, String current,
			ArrayList<String> result, int index) {
		if (index == N) {
			if (dictionary.containsKey(current)) {
				result.add(current);
			}
			return;
		}
		int ind = Integer.parseInt(nums[index]);
		ArrayList<String> numKeys = keys[ind];
		for (String str : numKeys) {
			phoneCodeHelper(dictionary, nums, N, current + str, result, index + 1);
		}
	}

}
