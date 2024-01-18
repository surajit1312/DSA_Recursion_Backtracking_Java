package recursion.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Leetcode: 39. Combination Sum
 * 
 * Link: https://leetcode.com/problems/combination-sum/description/
 * 
 * TC: O(2^T x K) where T is the Target and K = average length of combinations
 * generated
 * SC: O(K x X) where X is number of combinations
 * 
 */
public class P7_Get_All_Subsequences_With_Current_Sum_K {
    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> subseqList = combinationSum(candidates, target);
        System.out.println("Subsequences with sum " + target + " are : " + subseqList);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        helperCombination(candidates, target, result, current, 0);
        return result;
    }

    private static void helperCombination(int[] candidates, int target, List<List<Integer>> result,
            List<Integer> current,
            int index) {
        if (index == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<Integer>(current));
            }
            return;
        }
        // pick (can pick multiple times,so maintain same index)
        if (candidates[index] <= target) {
            current.add(candidates[index]);
            helperCombination(candidates, target - candidates[index], result, current, index);
            current.remove(current.size() - 1);
        }
        // not pick
        helperCombination(candidates, target, result, current, index + 1);
    }
}
