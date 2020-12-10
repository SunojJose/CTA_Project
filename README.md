# CTA_Project
A Java Application For Benchmarking Sorting Algorithms

The purpose of this application is to benchmark five sorting algorithms selected on the following criteria:

1. A simple comparison-based sort (Bubble Sort, Selection Sort or Insertion Sort)
2. An efficient comparison-based sort (Merge Sort, Quicksort or Heap Sort)
3. A non-comparison sort (Counting Sort, Bucket Sort or Radix Sort)
4. Any other sorting algorithm 
5. Any other sorting algorithm 

Bubble Sort, Merge sort, Counting Sort, Selection Sort, and Quick Sort were selected for the purpose. 
Each algorithms implemented are seperate JAVA classes of a Sort Interface along with a Util and Main class.
The Util class consists of helper methods to print the result. The main method of Main class will test each of the algorithms in turn.
To benchmark the algorithms, it is used arrays of randomly generated integers with different input sizes 1000, 2000, ..., 10000.
The running time (in milliseconds) for each algorithm can be measured 10 times, and the average of the 10 runs for each algorithm 
and each input size n can be output to the console when the program finishes executing.

The performance of the algorithms based on the console output was analysed and included in the file Benchmarking.docx

To compile the application: javac ie/gmit/dip/*.java

To run the application: java ie.gmit.dip.Main

The application is a sole work of Sunoj Jose for the module: Computational Thinking With Algorithms, of HDip in Science in Software Development.
For writing the codes of Sorting Algorithms the following sources were refered:

1. Sorting Algorithms Part-1, Part-2,Part-3, COMP08033 Computational Thinking with Algorithms, Patrick Mannion GMIT
2. https://www.geeksforgeeks.org
3. https://www.javatpoint.com




