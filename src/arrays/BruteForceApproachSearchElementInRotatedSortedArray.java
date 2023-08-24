//brute force approach to search the element in rotated sorted array
//time complexity is O(N) where N is the size of array.
//Reason for time complexity: we have to iterate N times to search the element
//space complexity O(1) as no extra space is used

package arrays;

public class BruteForceApproachSearchElementInRotatedSortedArray {
	public static int search(int arr[],int size,int key) {
		for(int i =0;i<size;i++) {
			if(arr[i]==key) {
				return i;   
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
			int arr[] = {4,5,6,7,8,9,10,0,1,2,3};
			int size = arr.length;
			int key = 8;
			int ans  = search(arr,size,key);
			if(ans==-1) {
				System.out.println("Target not found");
			}else {
				System.out.println("The Index is::"+ans);
			}
	}
}
