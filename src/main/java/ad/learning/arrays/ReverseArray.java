package ad.learning.arrays;

import java.util.Random;

public class ReverseArray {

	/*
	 * Function to reverse arr[] from start to end
	 */
	static int[] rvereseArray(int arr[]) {
		int temp;
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}

	/*
	 * Utility that prints out an array on a line
	 */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		printArray(arr);
		rvereseArray(arr);
		System.out.print("Reversed array is \n");
		printArray(arr);

	}

}
