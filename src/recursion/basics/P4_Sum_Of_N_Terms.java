/**
 * 
 */
package recursion.basics;

/**
 * 
 * Given an integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till Nth term.
 * 
 * Link: https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
 */
public class P4_Sum_Of_N_Terms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long N = 7L;
		long sum = sumOfSeries(N);
		System.out.println(sum);
	}

	private static long sumOfSeries(long N) {
		if (N < 1) {
			return 0;
		}
		return (long) Math.pow(N, 3) + sumOfSeries(N - 1);
	}

}
