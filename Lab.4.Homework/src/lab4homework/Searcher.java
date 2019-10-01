package lab4homework;

public class Searcher {
	public int linearSearch(int arr[], int arrSize, int searchVal) {
		for (int i=0; i<arrSize; i++) {
			if (arr[i] == searchVal) {
				return searchVal;
			} else {
				return 0;
			}
		}
		return searchVal;
	}
	
	public int binarySearch(int arr[], int arrSize, int searchVal) {
		int first = arr[0], last = arr[arrSize-1], mid = (first+last)/2;
		
		 while(first <= last){  
			 if (arr[mid] < searchVal) {
				 first = mid + 1;     
		     } else if (arr[mid] == searchVal) {
		    	 return searchVal; 
		     } else {
		         last = mid - 1;  
		     }
		     mid = (first + last)/2;  
		 }
		  
		 if (first > last){  
			 return 0;  
		 }  
		 return searchVal;
	}
}
