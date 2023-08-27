package arrays;

public class SpaceOptimisationUsingBitManipulation {

	public static void main(String[] args) {
		int a  = 60, b = 95;
		int size = (b-a)+1;
		int arr[] = new int[size];
		for(int i =a;i<=b;i++) {
			if(i%2==0 || i%5==0) {
				arr[i-a] = 1;
			}
		}
		for(int i = a;i <=b;i++) {
		if(arr[i-a] == 1) {
			System.out.print(i+" ");
	   }	
	 }
   }
}
