//program to search value in array

package arrays;
import java.util.Scanner;
public class SearchValue {
	
	
	public static int findValue(int arr[],int x) {
		
		//boolean b = false;
		for(int i = 0; i<arr.length;i++)
		{
			for(int j =i;j<arr.length;j++) {
				
			if(arr[i]==x) {
				 System.out.println("Contains the value "+x);
				 return x;
			}
		  }
		}
		return -1;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
					int arr[] = {2,4,3,5,7,8,1};
					System.out.println("Enter the element you want to check in array");
					int x = sc.nextInt();
					//findDuplicate(arr,x);
					int ans = findValue(arr, x);
					if(ans==-1) {
						System.out.println("Does not contain entered value");
					}
		}
		
	}
}
