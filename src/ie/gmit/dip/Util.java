package ie.gmit.dip;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * The Util class contains methods to help the Main class to output the result 
 * of the benchmarking application.
 * 
 * @author Sunoj Jose
 *
 */

public class Util {
	/**
	 * A method to print the elements of an array.
	 * 
	 * @param input
	 */

	public void printArray(int[] input) {
		for (int element : input) {
			System.out.print(element + "\t");
		}
	}

	/**
	 * A method to create an array of random numbers between 0 and 99 
	 * for the given input size of n and returns the array created.
	 * 
	 * @param n
	 * @return
	 */
	private int[] randomArray(int n) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		return array;

	}
	
	/**
	 * A method to find and return the average time taken for n runs 
	 * 
	 * The double array contains the time taken in each run of 
	 * certain implementation of the sort().
	 * 
	 * @param a
	 * @param n
	 * @return
	 */

	private double average(double a[], int n) {

		DecimalFormat df = new DecimalFormat("###.###");
		df.setRoundingMode(RoundingMode.CEILING);
		double sum = 0;
		double avg;

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		avg = Double.valueOf(df.format(sum / n));
		return (avg);

	}
	
	/**
	 * A method to test each implementations of sort() 
	 * and print the average time taken in milliseconds 
	 * for specified runs for specified input sizes.
	 * 
	 * @param sizes
	 * @param runs
	 * @param sort
	 */

	public void test(int[] sizes, int runs, Sort sort) {
		
		for (int size : sizes) {
			
			int[] input = randomArray(size);
			double[] result = new double[runs];
			
			for (int i = 0; i < runs; i++) {
				
				long startTime = System.nanoTime();
				sort.sort(input);
				long endTime = System.nanoTime();
				long elapsed = endTime - startTime;
				double timeMillis = elapsed / 1000000.0;
				result[i] = timeMillis;
			}
			
			System.out.print(average(result, runs) + "\t");
		}
	}
	

}
