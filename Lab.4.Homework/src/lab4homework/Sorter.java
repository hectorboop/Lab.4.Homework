package lab4homework;

public class Sorter {
	int[] bubbleSort(int arr[], int arrSize) {
		int temp = 0;
		for (int i=0; i<arrSize; i++) {
			for (int j=0; j<(arrSize-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	int[] selectionSort(int arr[], int arrSize) {
		for (int i=0; i<arrSize; i++) {
			int index = i;
			
			for(int j=i+1; j<arrSize; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			
			int smallerNumber = arr[index];   
			arr[index] = arr[i];  
			arr[i] = smallerNumber; 
		}
		return arr;
	}
	
	int[] insertionSort(int arr[], int arrSize) {
        for (int j=1; j<arrSize; j++) {  
            int key = arr[j];  
            int i = j-1; 
            while ((i>-1) && (arr[i] > key )) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
		return arr;
	}
}
