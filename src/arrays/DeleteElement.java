package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {

	public static void delete(int arr[],int element) {
		int size = arr.length;
		int[] newArray = new int[size-1];
		for(int i = 0,j=0;i<size;i++) {
			
			if(arr[i]!=element) {
				newArray[j] = arr[i];
				j++;
			}
			
		}
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(newArray);
//		}
		System.out.println(Arrays.toString(newArray));
	}
	
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int arr[] = {7,2,1,56,8,3,465,8,26,1,4,6,21,1};
		System.out.println("Enter the element you want to remove from the list");
		int element = sc.nextInt();
		
		System.out.println("After deleting the element the list is::");
		delete(arr,element);   //calling delete function 
	}

}
}
