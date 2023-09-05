//in selection sort we consider arr[0] as smallest element
// here we are running loop for each element multiple times 
//time complexity will be O(n^2)
package searchingAndsorting;

public class SelectionSort {
	
	public static void sorted(int arr[]) {
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int smallest = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {7,8,3,1,2};
		sorted(arr);
	}
}
