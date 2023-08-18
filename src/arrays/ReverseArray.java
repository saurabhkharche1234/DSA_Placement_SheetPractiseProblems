package arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ReverseArray extends Exception{
	
	public static void reverse(int arr[], int n) {
		for(int i = n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter all elements in array");
		
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr,size);
		}catch(InputMismatchException e) {
			System.out.println("Invalid input entered");
		}
	}

}
