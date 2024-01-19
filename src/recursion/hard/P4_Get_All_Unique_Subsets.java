package recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Leetcode: 90. Subsets II
 * 
 * Link: https://leetcode.com/problems/subsets-ii/description/
 * 
 * TC: O(2^n) for generating every subset and
 * O(k) to insert every subset in another data structure
 * if the average length of every subset is k. Overall O(k * 2^n)
 * 
 * SC: O(2^n * k) to store every subset of average length k.
 * Auxiliary space is O(n) if n is the depth of the recursion tree.
 * 
 */
public class P4_Get_All_Unique_Subsets {
    public static void main(String[] args) {
        int[] input = { 1, 2, 2 };
        List<List<Integer>> subsets = printSubsets(input);
        System.out.println(subsets);
    }

    private static List<List<Integer>> printSubsets(int[] input) {
        Arrays.sort(input);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(input, result, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void helper(int[] input, List<List<Integer>> result, List<Integer> ds, int index) {
        result.add(new ArrayList<Integer>(ds));
        for (int i = index; i < input.length; i++) {
            if (i != index && input[i] == input[i - 1]) {
                continue;
            }
            ds.add(input[i]);
            helper(input, result, ds, i + 1);
            ds.remove(ds.size() - 1);
        }
    }
}
