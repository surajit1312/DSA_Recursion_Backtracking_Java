/**
 * 
 */
package recursion.basics;

/**
 * 
 */
public class P3_Sum_Of_N_Natural_Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 16;
		long sum = sumFirstN(n);
		System.out.println(sum);
	}

	private static long sumFirstN(long n) {
		if (n < 1) {
			return 0L;
		}
		return n + sumFirstN(n - 1);
	}

}
