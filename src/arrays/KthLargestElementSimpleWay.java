//prog to find Kth largest element in an array only in sorted order not in distinct order
//e.g Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
//here time complexity is O(logN)
//this prog can be solved using heap in vector and queue for better time complexity

package arrays;

import java.util.Arrays;

public class KthLargestElementSimpleWay {
	public static void main(String[] args) {
		int arr[] = {3,2,1,5,6,4};
		int n = arr.length-1;
		int k = 2;
		
		Arrays.toString(arr);
		System.out.println(arr[n-k]);
	}
	
}