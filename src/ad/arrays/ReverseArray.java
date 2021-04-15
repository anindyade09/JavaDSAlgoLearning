package ad.arrays;

public class ReverseArray {

	/**
	 * In-place reversing an array.
	 * O(n/2)
	 * 
	 * @param a Input Array
	 * @return Reversed Array
	 */
	public static int[] reverseInPlace(int[] a) {
		
		for(int i = 0, j = a.length - 1; i < j; i++, j--) {
			//Loop continues till i and j cross over
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		
		return a; //reversed the array
	}

}
