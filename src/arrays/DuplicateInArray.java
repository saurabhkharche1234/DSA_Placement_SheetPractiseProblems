package arrays;
import java.util.ArrayList;
public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,3,4,5};
		
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
			
		}


	}

}
