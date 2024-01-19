package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode: Leetcode 46. Permutations
 * 
 * Link: https://leetcode.com/problems/permutations/description/
 * 
 * TC: O(N! x N)
 * SC: O(N) + O(N) ~ O(N)
 * 
 */
public class P9_Permutations_Of_Array_Elements {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> list = permute(nums);
        System.out.println("Permutations of Array " + Arrays.toString(nums) + " is : " + list);
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ds = new ArrayList<Integer>();
        boolean[] freq = new boolean[nums.length];
        Arrays.fill(freq, false);
        getPermutations(nums, result, ds, freq);
        return result;
    }

    private static void getPermutations(int[] nums, List<List<Integer>> result, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            result.add(new ArrayList<Integer>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                ds.add(nums[i]);
                freq[i] = true;
                getPermutations(nums, result, ds, freq);
                // backtrack
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }
}
