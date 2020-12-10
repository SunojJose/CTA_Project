package ie.gmit.dip;

/**
 * A java code to sort an array of numbers using Bubble Sort
 * The class BubbleSort is an implementation of Sort Interface.
 * 
 * @author Sunoj Jose
 *
 */

public class BubbleSort implements Sort {

	/**
	 * This implementation of sort method compares the elements of numbers 
	 * by traversing it from first to last by comparing elements as follows: 
	 * for i = 0 and j = 1 to n (where n is the length of numbers) 
	 * comparison: numbers[j-1] > numbers[j] 
	 * step-1 :
	 * compare numbers[0] and numbers[1] and swap their position if numbers[0] > numbers[1] 
	 * step-2 : 
	 * compare numbers[1] and numbers[2] and swap their position
	 * if numbers[1] > numbers[2] 
	 * ...... 
	 * step-n : 
	 * compare numbers[n-1] and
	 * numbers[n] and swap their position if numbers[n-1] > numbers[n] 
	 * After these steps the largest element is at last index. 
	 * The above steps repeat for i = 1, 2,...., n-1 and finally the array will be sorted.
	 * 
	 * Time complexity: O(n2) in average and worst cases. (Worst Case is when the
	 * array is reversely sorted). But if the array is already sorted (best case) it
	 * needs n-1 comparisons (approximately n). Thus O(n) is the time complexity in
	 * best case.
	 * 
	 * Space Complexity: It requires an extra memory space for storing the variable
	 * temp, thus space complexity is O(1).
	 */
	public void sort(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 1; j < numbers.length - i; j++) {

				if ((numbers[j - 1]) > numbers[j]) {

					int temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

}
