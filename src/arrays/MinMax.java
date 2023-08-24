//program to find minimum and maximum of array using linear sort
package arrays;
import java.util.*;

public class MinMax {
	
	public static class Node{
		int min;
		int max;
	}
	
	public static Node operation(int arr[], int n) {
		Node minmax = new Node();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n-1];
		return minmax;
		
	}
	
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			try {
						System.out.println("Enter the length of array");
						int length = sc.nextInt();
						int arr[] = new int[length];
					
						System.out.println("Enter elements of array");
					
						for(int i =0;i<length;i++) {
						arr[i] = sc.nextInt();
						}
						//int arr[] = {45,89,31,39,74,35,6,1};
					Node minmax = operation(arr,length);
					System.out.println("Minimum of array is::"+minmax.min);
					System.out.println("Maximum of array is::"+minmax.max);
						
				}catch(Exception e) {
					System.out.println("Invalid input entered");
				
			}
		}
	
	
}
}
