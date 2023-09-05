//here we consider first element as largest. it is opposite to selection sort and time complexity is same
package searchingAndsorting;

public class BubbleSort {
	
	public static void sort(int arr[], int n) {
		for(int i = 0;i<n-1;i++) {
			for(int j =0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,8,1,3,2};
		int n = arr.length;
		sort(arr,n);
	}
}
