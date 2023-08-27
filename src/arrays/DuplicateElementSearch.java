//time complexity O(N^2) because we are iterating N numbers using two loops
package arrays;

public class DuplicateElementSearch {

	public static void duplicate(int arr[],int size) {
		for(int i = 0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+"  ");
				}
			}
		}
	}
	public static void main(String[] args) {
//		int arr[] = {1,4,6,6,3,6,6,4,8};
		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
		int size  = arr.length;
		duplicate(arr,size);
	}

}
