package backtrackingProblems;
import java.util.*;

public class Nqueens {
//	final int n = 4;
	
	public static void printBoard(List<List<String>> allboards) {
		for(int i = 0; i<allboards.size(); i++)      
		{
			System.out.print(allboards.get(i)+" ");
		}
		
		
	}
	public static void saveBoard(char[][] board, List<List<String>> allboards ) {
		String row = "";
		List<String> boardA = new ArrayList<>();
		
		for(int i=0;i<board.length;i++) {
			row = "";
			for(int j =0;j<board[0].length;j++) {
				if(board[i][j]=='Q')
					row += 'Q';
				else 
					row += '.';
			}
			boardA.add(row);
		}	
		allboards.add(boardA);
		printBoard(allboards);
		
	}
	
	public static boolean isSafe(int row, int col, char[][] board) {
		//horizontal
		for(int j = 0; j<board.length; j++) {
			if(board[row][j]=='Q') {
				return false;
			}
		}
		
		//vertical
		for(int i =0; i<board.length; i++) {
			if(board[i][col]=='Q') {
				return false;
			}
		}
		
		//upper left
		int r =row;
		for(int c= col; c>=0 && r>=0; c--, r--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		//upper right
		r =row;
		for(int c= col; c<board.length && r>=0; c++,r--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//lower left
		r=row;
		for(int c=col; r<board.length && c>=0; r++,c--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//lower right
		r=row;
		for(int c= col; c<board.length && r<board.length; c++, r++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		return true;
	}
	
	public static void helper(char[][] board, List<List<String>> allboards, int col) {
		if(col==board.length) {
			saveBoard(board,allboards);
			return;
		}
		
		for(int row = 0; row<board.length;row++) {
			if(isSafe(row,col,board)) {
				board[row][col] = 'Q';
				helper(board, allboards, col+1);
				board[row][col] = '.';
			}
		}
		
	}
	
	public static List<List<String>> solveQueens(int n){
		List<List<String>> allboards = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(board, allboards, 0);
		return allboards;
	}

	public static void main(String[] args) {
		int n = 4;
		solveQueens(n);
	}

}
