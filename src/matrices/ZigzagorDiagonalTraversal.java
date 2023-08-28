//java program to print all elements of matrix in diagonal order

package matrices;

public class ZigzagorDiagonalTraversal {
	static final int row = 5;
	static final int column  = 4;
	
	static int min(int a, int b) {
		return (a<b)?a:b;
	}
	
	static int min(int a, int b, int c) {
		return min(min(a,b),c);
	}
	
	static int max(int a, int b) {
		return (a>b)? a:b;
	}
	
	static void diagonalOrder(int M[][]) {
		for(int line = 1;line<=(row+column -1);line++) {  //there will be row+column-1 lines in the output
			int start_col = max(0,line-row);
			int count = min(line,(column - start_col),row);

			for(int j =0 ;j<count ; j++) {
				System.out.print(M[min(row,line)-j-1][start_col+j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static void printMatrix(int M[][]) {
		for(int i =0;i<row;i++) {
			for(int j = 0;j<column;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int M[][] = {{1,2,3,4},{5,6,7,8},
				{9,1,7,3},{4,5,6,2},
				{2,7,4,9},};
		System.out.println("given matrix is:: ");
		printMatrix(M);
		System.out.println("Matrix after diagonal print is::");
		diagonalOrder(M);
	}

}
