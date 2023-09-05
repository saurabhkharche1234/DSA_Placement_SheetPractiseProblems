//java program to print all elements of matrix in diagonal order

package matrices;

public class DiagonalPrint {
	public static void diagonalPrint(int arr[][],int row, int column) {
		for(int k = 0;k<=row-1;k++) {
			int i =k;
			int j = 0;
			while(i>=0) {
				System.out.print(arr[i][j]+" ");
				i = i-1;
				j = j+1;
			}
			System.out.println();
		}
		
		for(int k =0;k<=column;k++) {
			int i = row;
			int j = k;
			while(j<=column) {
				System.out.print(arr[i][j]+" ");
				i = i-1;
				j = j+1;
			}
			
			System.out.println();
		}
		
	}
	
	public static void printMatrix(int arr[][],int row,int column) {
		for(int i = 0;i<row;i++) {
			for(int j =0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of rows and columns");
//		int row = sc.nextInt();
//		int column = sc.nextInt();
//		int arr[][] = new int[row][column];
//		for(int i = 0;i<row;i++) {
//			for(int j =0;j<column;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		int arr[][] = {{1,2,3,4},{5,6,7,8},
				{9,1,7,3},{4,5,6,2},
				{2,7,4,9}}; 
		int row = 5,column =4;
		System.out.println("Entered matrix is::");
		printMatrix(arr,row,column);
		
		System.out.println("Matrix printed in diagonal pattern is::");
		diagonalPrint(arr,row-1,column-1);
	}
}
