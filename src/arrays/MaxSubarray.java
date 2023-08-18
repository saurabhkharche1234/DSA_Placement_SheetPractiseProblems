//java prog to find max subarray sum out of given arraylist that is Kadane's Algorithm
package arrays;

public class MaxSubarray {

	public static int maxsum(int arr[], int size) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<size ; i++) {
			int sum =0;
			for(int j = i;j<size;j++) {
				sum = sum + arr[j]; //other way to write is sum += arr[j]
				
				if(sum>max) {
					max= sum;
					
				}
				
			}
		}
		
		return max;
		
	}
	public static void main(String[] args) {
	int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
	
	int size = arr.length;
	
	System.out.println(maxsum(arr,size));
	
	}

}
