package ie.gmit.dip;

/**
 * A java class contains the methods to sort an array of integers
 * using quick sort algorithm.
 * 
 * @author Sunoj Jose
 *
 */

public class QuickSort implements Sort {

	/**
	 * This implementation of the sort() invokes the overloaded sort() of the QuickSort class
	 * which recursively partition the numbers array based on the partitioIndex, which is 
	 * determined by invoking the divide().
	 * 
	 * Time complexity: In the best case O(n log n); O(n) for the first iteration of the given input
	 * and 2 * o(n/2) for the two partitions.
	 * The worst case is when the pivot is the largest/smallest.
	 * Then it selects only one element in each iteration; means O(n) + O(n-1)+ ... + O(1) -> O(n²)
	 * On average To sort an array of n distinct elements, it takes O(n log n) time in
	 * expectation, averaged over all n! permutations of n elements with equal probability.
	 * 
	 * Space complexity: O(log n)
	 * 
	 */
	
	public void sort(int[] numbers) {
		
		sort(numbers, 0, numbers.length - 1);
		
	}
	
	/**
	 * This method invokes divide() and performs the sorting by recursively partition the array 
	 * with the help of partitionIndex returned by divide().
	 * 
	 * @param numbers
	 * @param begin
	 * @param end
	 */
	
	private void sort(int[] numbers, int begin, int end) {
		
		if (begin < end) {
			
			int partitionIndex = divide(numbers, begin, end);
			sort(numbers, begin, partitionIndex - 1);
			sort(numbers, partitionIndex + 1, end);
		}
		
	}
	
	/**
	 * In the divide method it is set the pivot as last element of the array.
	 * Checks each element of the array for elements smaller than pivot 
	 * and place them before(left side of) pivot.
	 * At the end of the partition all elements less than pivot are on its left 
	 * and all elements greater than pivot is on its right; and pivot is on its 
	 * sorted index. This value of index is returned.
	 *  
	 * @param numbers
	 * @param begin
	 * @param end
	 * @return
	 */
	private int divide(int[] numbers, int begin, int end) {
		
		int pivot = numbers[end];
		int index = begin - 1;
		
		for (int i = begin; i < end; i++ ) {
			
			if (numbers[i] < pivot) {
				
				index++;
				int temp = numbers[index];
				numbers[index] = numbers[i];
				numbers[i] = temp;
			}
		}
		
		int temp = numbers[index + 1];
		numbers[index + 1] = numbers[end];
		numbers[end] = temp;
		
		return  index + 1;
	}

}
