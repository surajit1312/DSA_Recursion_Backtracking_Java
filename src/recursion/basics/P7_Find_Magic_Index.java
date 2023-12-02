/**
 * 
 */
package recursion.basics;

import java.util.ArrayList;

/**
 * 
 * CodingNinjas: Magic Index
 * 
 * Link: https://www.codingninjas.com/studio/problems/magic-index_1199229
 * 
 * TC: O(n)
 * SC: O(1)
 * 
 */
public class P7_Find_Magic_Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] arr = { -1, -1, -1, 4, 4, 4 };
		for (int i = 0; i < arr.length; i++) {
			a.add(arr[i]);
		}
		int getMagicIndex = magicIndex(a, a.size());
		System.out.println("Magic index : " + getMagicIndex);
	}

	private static int magicIndex(ArrayList<Integer> a, int n) {
		return magicIndexHelper(a, 0);
	}

	private static int magicIndexHelper(ArrayList<Integer> a, int index) {
		if (index == a.size()) {
			return -1;
		}
		if (index == a.get(index)) {
			return index;
		}
		return magicIndexHelper(a, index + 1);
	}

}
