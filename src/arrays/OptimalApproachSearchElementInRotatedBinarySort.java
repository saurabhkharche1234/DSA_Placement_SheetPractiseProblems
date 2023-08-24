//Optimal Approach to search element index in rotated sorted array
//time complexity is O(logN)where N is the number size of array
// reason of time complexity: we are using binary search to search the key given
//Space complexity is O(1) because we have not used any extra space to perform the operation

package arrays;

public class OptimalApproachSearchElementInRotatedBinarySort {
	
	public static int search(int arr[],int size, int key) {
		int si = 0;
		int ei = size-1;
		
		while(si<=ei) {
			int mid = (si+ei)/2; //finding mid of the given array
			
			if(key == arr[mid]) {  //if mid is the key
				return mid;
			}
			
			if(arr[si]<=arr[mid]) {  //if left part of given array is sorted
				if(arr[si]<=key && key<= arr[mid]) {  // if key exists in first half
					ei = mid -1;  //if element exists
				}else {
					si = mid +1;   //element does not exists 
				}
				
			}else {  //right part is sorted
				if(arr[mid]<=key&& key<=arr[ei]) {
					si = mid +1;  //if element exists
				}else {
					ei = mid-1;  //element does not exist
				}
			}
		}
		return -1;  //is element does not exists then returning -1
	}
	
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,9,0,1,3};  
		int size = arr.length;
		int key = 5;
		
		int ans = search(arr,size,key);
		
		if(ans == -1) {
			System.out.println("Target not found");
		}else {
			System.out.println("The index is::"+ans);
		}
		
	}

}
