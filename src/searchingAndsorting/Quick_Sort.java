//in quick sort we consider one element as pivot and then bring pivot to its right position 

package searchingAndsorting;

import java.util.Arrays;

public class Quick_Sort {
	
	public static int partition(int arr[], int low, int high) {
		int i = low-1;
		int pivot = arr[high];
		
		for(int j = low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i]; //temp storing value greater than pivot 
		arr[i] = pivot;//moving pivot to its actual position
		arr[high] = temp; // shifting values greater than pivot after pivot index
		return i;
		
	}
	
	public static void quicksort(int arr[], int low, int high) {
		if(low<high) {
			int pidx = partition(arr,low,high);
			quicksort(arr,low,pidx-1);
			quicksort(arr,pidx+1,high);
			
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {6,7,3,2,9,8};
		int n = arr.length;
		quicksort(arr,0,n-1);
		//print
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
