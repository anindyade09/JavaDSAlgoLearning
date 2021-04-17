package ad.dynamic.programming;

public class FibonacciSolution {
	
	static int[] lookup = new int[100];

	/**
	 * Find the nth number in a fibonacci series using recursion
	 * @param n
	 */
	public static int findFibonacciNumberUsingRecursion(int n) {
		if(n <= 1) {
			return n;
		}
		return findFibonacciNumberUsingRecursion(n-1) + findFibonacciNumberUsingRecursion(n-2);
	}

	/**
	 * Find the nth number in a fibonacci series using memoization
	 * @param n
	 */
	public static Integer findFibonacciNumberUsingMemoization(int n) {
		if (lookup[n] == 0) { //check if the lookup already has the value calculated and return it
			if (n <= 1) {
				lookup[n] = n; //base cases to be set in the lookup
			} else {
				//Very similar to recursion but also save the value in lookup to save on calculation next time
				lookup[n] = findFibonacciNumberUsingMemoization(n - 1) + findFibonacciNumberUsingMemoization(n - 2);
			}
		}
		return lookup[n]; 
	}

}
