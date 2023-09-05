//permute two arrays such that sum of every pair is greater than or equal to k
//input: a[] = {2,1,3} and b={7,8,9};
//k =10

package searchingAndsorting;

import java.util.*;
public class Prog1 {

	static boolean isPossible(Integer a[], int b[],
		            int n, int k)
		{
		
		Arrays.sort(a, Collections.reverseOrder());// Sort the array a[] in decreasing order. // class is defined as integer
		Arrays.sort(b);// Sort the array b[] in increasing order.
		// Checking condition on each index.
		for (int i = 0; i < n; i++) {
		if (a[i] + b[i] < k) {
		return false;
		}
		}
		return true;
		}
	public static void main(String[] args) {
		Integer a[] = {2,1,3};
		int b[] ={7,8,9};
		int n = a.length;
		int k =10;
		if(isPossible(a,b,n,k)) {
			System.out.println("yes");
		}else
			System.out.println("Not Possible");

	}

}
