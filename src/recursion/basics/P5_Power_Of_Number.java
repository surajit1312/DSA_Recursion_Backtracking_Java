/**
 * 
 */
package recursion.basics;

/**
 * 
 * CodingNinjas: Find power of a number
 * 
 * Link:
 * https://www.codingninjas.com/studio/problems/find-power-of-a-number_893198
 * 
 */
public class P5_Power_Of_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int X = 5, N = 6;
		long power = Pow(X, N);
		System.out.println(power);
	}

	private static long Pow(int X, int N) {
		if (X == 0) {
			return 0;
		}
		if (N == 0) {
			return 1;
		}
		long powHalf = Pow(X, N / 2) * Pow(X, N / 2);
		return N % 2 == 0 ? powHalf : X * powHalf;
	}

}
