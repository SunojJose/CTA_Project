package ie.gmit.dip;

/**
 * A java code to sort an array of integers using Merge Sort.
 *
 * @author Sunoj Jose
 *
 */

public class MergeSort implements Sort {
	
	/**
	 * The implementation of sort method.
	 * It invokes divide() method to do the sorting.
	 * 
	 * Time complexity: O(n log n ) in best, worst, and average cases; since
	 * O(log n) comparisons for all n sub-arrays and O(1) time to find the middle index
	 * for all n sub-arrays.
	 * 
	 * Space complexity: O(n), since 1 space each for n sub-arrays. 
	 * 
	 */

	public void sort(int[] numbers) {

		divide(numbers, 0, numbers.length - 1);
	}
	
	/**
	 * The divide() method uses recursion to divide numbers array into sub-arrays.
	 * The division is based on the middle index and the recursion continues when
	 * begin < end as shown in the method.
	 * Then it invokes merge() to assign elements and merge the arrays.
	 * 
	 * @param numbers
	 * @param begin
	 * @param end
	 */

	private void divide(int[] numbers, int begin, int end) {

		if (begin < end) {

			int middle = (begin + end) / 2;
			divide(numbers, begin, middle);
			divide(numbers, middle + 1, end);
			merge(numbers, begin, middle, end);
		}

	}

	/**
	 * This overloaded method assigns elements to both sub-arrays
	 * 
	 * then invokes the other merge() to merge the arrays.
	 * 
	 * @param numbers
	 * @param begin
	 * @param middle
	 * @param end
	 */
	private void merge(int[] numbers, int begin, int middle, int end) {

		int left = middle - begin + 1;
		int right = end - middle;

		int[] subArrayLeft = new int[left];
		int[] subArrayRight = new int[right];

		for (int i = 0; i < left; i++) {
			subArrayLeft[i] = numbers[begin + i];
		}

		for (int i = 0; i < right; i++) {
			subArrayRight[i] = numbers[middle + 1 + i];
		}

		merge(numbers, subArrayLeft, subArrayRight, begin);

	}

	/**
	 * This overloaded method does the merging process. 
	 * 
	 * First compares the elements of both sub-arrays and the lowest is added to the 
	 * numbers array.
	 * 
	 * If any elements left in the sub-arrays after the above process, 
	 * it is then added to the end of the numbers array.
	 * 
	 * The resultant array is the sorted array.
	 * 
	 * @param numbers
	 * @param subArrayLeft
	 * @param subArrayRight
	 * @param begin
	 */
	
	private void merge(int[] numbers, int[] subArrayLeft, int[] subArrayRight, int begin) {

		int i = 0;
		int j = 0;
		int k = begin;

		while (i < subArrayLeft.length && j < subArrayRight.length) {

			if (subArrayLeft[i] <= subArrayRight[j]) {

				numbers[k] = subArrayLeft[i];
				i++;

			} else {

				numbers[k] = subArrayRight[j];
				j++;
			}

			k++;
		}

		while (i < subArrayLeft.length) {

			numbers[k] = subArrayLeft[i];
			i++;
			k++;
		}

		while (j < subArrayRight.length) {

			numbers[k] = subArrayRight[j];
			j++;
			k++;
		}
	}

}
