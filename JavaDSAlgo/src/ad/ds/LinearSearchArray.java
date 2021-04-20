package ad.ds;

/**
 * Linear Search Implementation Using an Array
 * Udemy: /course/data-structures-and-algorithms-the-complete-guide/learn/lecture/13432178#overview
 */
public class LinearSearchArray {
	
	/**
	 * Function to search an element and return the first occurrence index.
	 * @param arr Input Array
	 * @param element Element to be searched in the Input Array
	 * @return Index of the first occurrence
	 */
	public static int searchElement(int[] arr, int element) {
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] == element) {
				//Return the i'th position that contains the first occurrence
				return i;
			}
		}
		//If element not found in the array
		return -1;
	}

}
