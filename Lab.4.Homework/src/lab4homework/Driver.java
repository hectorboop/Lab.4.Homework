package lab4homework;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Searcher search = new Searcher();
		Sorter sort = new Sorter();
		
		int arr[] = new int[5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Enter number " + (i+1));
			int number = in.nextInt();
			
			arr[i] = number;
		}

		System.out.println(Arrays.toString(arr));
		
		System.out.println("Select what to do with the array below:");
		System.out.println("[Press 1] - Linear Search");
		System.out.println("[Press 2] - Binary Search");
		System.out.println("[Press 3] - Bubble Sort");
		System.out.println("[Press 4] - Selection Sort");
		System.out.println("[Press 5] - Insertion Sort");
		
		int choice = in.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter search value: ");
				int searchVal = in.nextInt();
				
				int a = search.linearSearch(arr, arr.length, searchVal);
				System.out.println("Result of search: " + a);
				break;
				
			case 2:
				System.out.println("Enter search value: ");
				int s = in.nextInt();
				
				sort.selectionSort(arr, arr.length);
				int b = search.binarySearch(arr, arr.length, s);
				System.out.println("Result of search: " + b);
				break;
				
			case 3:
				sort.bubbleSort(arr, arr.length);
				System.out.print("Result of sort: ");
				System.out.println(Arrays.toString(arr));
				break;
			
			case 4:
				sort.selectionSort(arr, arr.length);
				System.out.print("Result of sort: ");
				System.out.println(Arrays.toString(arr));
				break;
			
			case 5:
				sort.insertionSort(arr, arr.length);
				System.out.print("Result of sort: ");
				System.out.println(Arrays.toString(arr));
				break;
				
			default: break;
		}
		
		
		
	}
}