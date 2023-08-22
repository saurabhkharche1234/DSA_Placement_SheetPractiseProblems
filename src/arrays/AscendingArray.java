package arrays;

public class AscendingArray {
	
	
	public static void main(String[] args) {
		int arr[] = {2,8,4,1,5,3,7,9,10};
		int size = arr.length;

		for(int i=0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];  //swap
					arr[j]  = arr[i];
					arr[i] = temp;
				}		
			}
		}
		
		System.out.println("The array in sorted order is");
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
