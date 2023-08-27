//longest subarray with sum divisible by k

package arrays;

public class LongestSubArrayWithSumDivisibleByK {
	
	public static int sumdivi(int arr[],int n,int k) {
		int maximum = 0;
		for(int i =0;i<n;i++)
		{
			int sum =0;
			for(int j = i;j<n;j++) {
				sum += arr[j];
				if(sum%k==0) {
					maximum = Math.max(maximum, j-i+1);
					
				}
			}
			
		}
		return maximum;
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 7, 6, 1, 4, 5 };
		int n = arr.length;
		int k = 3; //given value
		int max = sumdivi(arr,n,k);
		System.out.println("length of longest subarray with divisible k is:: "+max);
	}
}
