/**
 * 
 */
package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingNinjas: Power Set
 * 
 * Link: https://www.codingninjas.com/studio/problems/power-set_1062667
 * 
 * TC: O(2^n)
 * SC: O(2^n)
 * 
 */
public class P2_Get_PowerSet_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<ArrayList<Integer>> result = pwset(arr);
		System.out.println("Powerset of " + arr + " is : " + result);
	}

	private static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> current = new ArrayList<Integer>();
		powerSetHelper(arr, 0, current, result);
		return result;
	}

	private static void powerSetHelper(ArrayList<Integer> arr, int index, ArrayList<Integer> current,
			ArrayList<ArrayList<Integer>> result) {
		// Base case
		if (index == arr.size()) {
			result.add(new ArrayList<Integer>(current));
			return;
		}
		// Take
		current.add(arr.get(index));
		powerSetHelper(arr, index + 1, current, result);
		// Not take
		// backtrack to remove element added at line
		current.remove(current.size() - 1);
		powerSetHelper(arr, index + 1, current, result);
	}

}
