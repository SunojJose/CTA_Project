package ie.gmit.dip;

/**
 * The main class of the java application for Benchmarking sorting algorithms.
 * 
 * The main() of this class prints the result of the benchmarking.
 * It utilizes the utility methods of the Util class to output the result.
 * 
 * @author Sunoj Jose
 *
 */

public class Main {
	
	/**
	 * The main method 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000}; 

		int numberOfRuns = 10;

		Sort sort = new BubbleSort();

		Util util = new Util();

		System.out.print("Algorithm|Size:\t");

		util.printArray(sizes);

		System.out.println();

		System.out.print("Bubble Sort\t");

		print(sizes, numberOfRuns, sort);

		sort = new SelectionSort();

		System.out.print("Selection Sort\t");

		print(sizes, numberOfRuns, sort);

		sort = new MergeSort();

		System.out.print("Merge Sort\t");

		print(sizes, numberOfRuns, sort);

		sort = new QuickSort();

		System.out.print("Quick Sort\t");

		print(sizes, numberOfRuns, sort);

		sort = new CountingSort();

		System.out.print("Counting Sort\t");

		print(sizes, numberOfRuns, sort);

	}

	/**
	 * A helper method to print result
	 * 
	 * @param sizes
	 * @param runs
	 * @param sort
	 */
	
	private static void print(int[] sizes, int runs, Sort sort) {
		
		Util util = new Util();
		util.test(sizes, runs, sort);
        System.out.println();
		
	}
}
