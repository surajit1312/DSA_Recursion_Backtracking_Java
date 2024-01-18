package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * GeeksForGeeks: Subset Sums
 * 
 * Link: https://www.geeksforgeeks.org/problems/subset-sums2234/1
 * 
 * TC: O(2^N) + O(2^Nlog(2^N)) - Total nodes in Recursion Tree = 2^N
 * SC: O(2^N)
 * 
 */
public class P8_Get_Array_Subset_Sums {
    public static void main(String[] args) {
        int N = 3;
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5, 2, 1));
        ArrayList<Integer> sums = subsetSums(arr, N);
        System.out.println("Array Subset sums are : " + sums);
    }

    private static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        subsetHelper(arr, N, result, 0, 0);
        Collections.sort(result);
        return result;
    }

    private static void subsetHelper(ArrayList<Integer> arr, int N, ArrayList<Integer> result, int index, int sum) {
        if (index == N) {
            result.add(sum);
            return;
        }
        // pick
        sum += arr.get(index);
        subsetHelper(arr, N, result, index + 1, sum);
        // not pick
        sum -= arr.get(index);
        subsetHelper(arr, N, result, index + 1, sum);
    }
}
