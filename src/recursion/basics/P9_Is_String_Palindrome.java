/**
 * 
 */
package recursion.basics;

/**
 * 
 * CodingNinjas: Check Palindrome
 * 
 * Link: https://www.codingninjas.com/studio/problems/check-palindrome_4219630
 * 
 * TC: O(n/2) ~ O(n)
 * SC: O(n/2) ~ O(n)
 * 
 */
public class P9_Is_String_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "RADAR";
		Boolean isValid1 = isPalindrome(s1);
		System.out.println("String " + s1 + " is Palindrome : " + isValid1);

		String s2 = "CAR";
		Boolean isValid2 = isPalindrome(s2);
		System.out.println("String " + s2 + " is Palindrome : " + isValid2);

		String s3 = "MALAYALAM";
		Boolean isValid3 = isPalindromeAgain(s3);
		System.out.println("String " + s3 + " is Palindrome : " + isValid3);

		String s4 = "KKLLOALLKK";
		Boolean isValid4 = isPalindromeAgain(s4);
		System.out.println("String " + s4 + " is Palindrome : " + isValid4);
	}

	/**
	 * Using two pointers approach
	 * 
	 * @param s
	 * @return
	 */
	private static Boolean isPalindrome(String s) {
		return isPalindromeCheck(s, 0, s.length() - 1);
	}

	/**
	 * Using two pointers approach
	 * 
	 * @param s
	 * @param low
	 * @param high
	 * @return
	 */
	private static Boolean isPalindromeCheck(String s, int low, int high) {
		if (s == null || s.length() == 0) {
			return true;
		}
		if (low >= high) {
			return true;
		}
		if (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
		}
		return isPalindromeCheck(s, low + 1, high - 1);
	}

	/**
	 * Using one pointer approach
	 * 
	 * @param s
	 * @return
	 */
	private static Boolean isPalindromeAgain(String s) {
		return isPalindromeCheckAgain(s, 0);
	}

	/**
	 * Using two pointers approach
	 * 
	 * @param s
	 * @param low
	 * @param high
	 * @return
	 */
	private static Boolean isPalindromeCheckAgain(String s, int start) {
		if (s == null || s.length() == 0) {
			return true;
		}
		int n = s.length();
		if (start >= n / 2) {
			return true;
		}
		if (start < n / 2) {
			if (s.charAt(start) != s.charAt(n - start - 1)) {
				return false;
			}
		}
		return isPalindromeCheckAgain(s, start + 1);
	}

}
