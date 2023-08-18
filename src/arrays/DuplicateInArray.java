package arrays;
import java.util.Scanner;
public class DuplicateInArray {
	
	
	public static void findDuplicate(int arr[],int x) {
		
		//boolean b = false;
		for(int i = 0; i<arr.length;i++)
		{
			for(int j =i;j<arr.length;j++) {
				
			if(arr[i]==x) {
				 System.out.println("Contains the value "+x);
				break;
			}
	}
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of elements");
//		int size = sc.nextInt();
//		System.out.println("Enter all elements::");
//		int arr[] = new int[size];
//		
//		for(int i = 0;i<size;i++) {
//			arr[i] = sc.nextInt();
//		}
		int arr[] = {2,4,3,5,7,8,1};
		System.out.println("Enter the element you want to check in array");
		int x = sc.nextInt();
		findDuplicate(arr,x);
		
	}
}
