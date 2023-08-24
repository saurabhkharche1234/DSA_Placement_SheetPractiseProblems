//if rotated sorted array contains duplicates then
//time complexity best case: O(logN) worst case: O(N/2)
// In the best and average scenarios, the binary search algorithm is primarily utilized and
// hence the time complexity is O(logN). 
// However, in the worst-case scenario, where all array elements are the same 
// but not the target (e.g., given array = {3, 3, 3, 3, 3, 3, 3}), 
// we continue to reduce the search space by adjusting the low and high pointers until they intersect. 
// This worst-case situation incurs a time complexity of O(N/2).

package arrays;
public class OptimalApproachSearchElementInRotatedSortedArraywithDuplicates {
	
	public static int search(int arr[],int size, int key) {
		int si = 0;
		int ei = size -1;
		
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[si]== arr[mid] && arr[mid]== arr[ei]) {  //edge case
				si++;
				ei--;
				continue;
			}
			
			if(arr[si]<=arr[mid]) {
				if(arr[si]<=key && key<= arr[mid]) {
					ei = mid-1;
				}else {
					si = mid +1;
				}
				
			}else {
				if(arr[mid]<=key && key<= arr[ei]) {
					si = mid +1;
				}else {
					ei = mid-1;
				}
			}
			
		}
		
		return -1;
	}
	
	
	public static void main(String args[]) {
		
	int arr[] = {4,4,4,5,6,0,1,2,3,3,3,3,4,4};
	int size = arr.length;
	int key = 4;
	
	int ans  = search(arr,size,key);
	
	if(ans == -1) {
		System.out.println("Target not found");
	}else {
		System.out.println("The index is::"+ans);
	}
	
	}	
}