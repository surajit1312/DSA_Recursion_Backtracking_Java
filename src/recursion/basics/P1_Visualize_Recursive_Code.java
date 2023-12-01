/**
 * 
 */
package recursion.basics;

/**
 * 
 */
public class P1_Visualize_Recursive_Code {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		System.out.println("---------------------");
		recursiveCallOne(n);
		System.out.println("---------------------");
		recursiveCallTwo(n);
	}

	private static void recursiveCallOne(int n) {
		// Base condition
		if (n == 0) {
			return;
		}
		System.out.println(n);
		System.out.println("Before recursive call 1");
		recursiveCallOne(n - 1);
		System.out.println("After recursive call 1");
	}

	private static void recursiveCallTwo(int n) {
		// Base condition
		if (n == 0) {
			return;
		}
		System.out.println("Before recursive call 2");
		recursiveCallTwo(n - 1);
		System.out.println("After recursive call 2");
		System.out.println(n);
	}

}
