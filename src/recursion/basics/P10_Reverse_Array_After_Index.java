/**
 * 
 */
package recursion.basics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * CodingNinjas: Reverse The Array
 * 
 * Link: https://www.codingninjas.com/studio/problems/reverse-the-array_1262298
 * 
 * TC: O(n/2) ~ O(n)
 * SC: O(n/2) ~ O(n)
 * 
 */
public class P10_Reverse_Array_After_Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = { 10, 4, 5, 2, 3, 6, 1, 3, 6 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			arr.add(nums[i]);
		}
		int m = 3;
		reverseArray(arr, m);
		System.out.println("Reverse of " + Arrays.toString(nums) + " after index " + m + " : " + arr);
	}

	private static void reverseArray(ArrayList<Integer> arr, int m) {
		int low = m + 1;
		int high = arr.size() - 1;
		reverseArrayHelper(arr, low, high);
	}

	private static void reverseArrayHelper(ArrayList<Integer> arr, int low, int high) {
		if (arr == null || arr.isEmpty()) {
			return;
		}
		if (low >= high) {
			return;
		}
		if (low < high) {
			int temp = arr.get(high);
			arr.set(high, arr.get(low));
			arr.set(low, temp);
		}
		reverseArrayHelper(arr, low + 1, high - 1);
	}

}
