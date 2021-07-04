package ad.ds;

/**
 * Binary Search implementation using an Array
 */
public class BinarySearchArray {
	
	public static int binarySearchArray(int[] arr, int searchElement, int start, int end) {
		
		// Check till End > Start
		if (end > start) {

			// Compare the middle element to the searchElement
			int mid = start + (end - start) / 2;

			if (arr[mid] == searchElement) {
				return mid; // Found the element!
			} else {
				// If arr[mid] < searchElement then the element must lie in the second half of
				// the array
				if (arr[mid] < searchElement) {
					binarySearchArray(arr, searchElement, mid + 1, end);
				} else {
					// Else element must lie in the first half of the array
					binarySearchArray(arr, searchElement, start, mid - 1);
				}
			}

		}
		
		//If element not found
		return -1;
	}
	
	/**
	 * Search an Array (sorted) using Binary search method.
	 * @param arr Input array
	 * @param searchElement Element to be searched
	 * @return Index of the searched element in array. -1 if not found.
	 */
	public static int binarySearch(int[] arr, int searchElement) {
		return binarySearchArray(arr, searchElement, 0, arr.length - 1);
	}
	
}
