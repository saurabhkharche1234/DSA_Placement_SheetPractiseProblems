package arrays;

import java.util.Arrays;

//repeat and missing element in array
//given array and missing element is 4, you need to print only repeat value and missing value of given array like[3,4]

public class Practise_Prog {
	public static int duplicate(int arr[]) {
		int repeat = 0;
		Arrays.sort(arr);
		int size = arr.length;
		for(int i =0;i<size;i++) {
			if(arr[i]==arr[i+1]) {
				return arr[i];
			}
		}
		
		return -1;
	}
	public static void main(String args[]) {
	int arr[] = {3,1,2,5,2,3};
	int missing  = 4;
	int ans = duplicate(arr);
	System.out.println(duplicate(arr));
	if(ans ==-1) {
		System.out.println("No duplicates");
	}
	}
}