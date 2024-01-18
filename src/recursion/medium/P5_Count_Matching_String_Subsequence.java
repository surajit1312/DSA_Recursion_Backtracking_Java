package recursion.medium;

import java.util.ArrayList;

/**
 * 
 * GeeksForGeeks: String Subsequence
 * 
 * Link:
 * https://www.geeksforgeeks.org/problems/find-number-of-times-a-string-occurs-as-a-subsequence3020/1
 * 
 * TC: O(N x M), where N and M are length of two strings
 * SC: O(N x M)
 * 
 */
public class P5_Count_Matching_String_Subsequence {
    public static void main(String[] args) {
        String S1 = "geeksforgeeks";
        String S2 = "gks";
        int count = countWays(S1, S2);
        System.out.println("No of matching subsequences : " + count);
    }

    private static int countWays(String S1, String S2) {
        String[] s = S1.split("");
        String current = "";
        ArrayList<String> countList = new ArrayList<String>();
        helper(s, current, 0, S2, countList);
        return countList.size();
    }

    private static void helper(String[] s, String current, int index, String S2, ArrayList<String> countList) {
        if (index == s.length) {
            if (current.equals(S2)) {
                countList.add(current);
            }
            return;
        }
        // pick
        helper(s, current + s[index], index + 1, S2, countList);
        // not pick
        helper(s, current, index + 1, S2, countList);
    }
}
