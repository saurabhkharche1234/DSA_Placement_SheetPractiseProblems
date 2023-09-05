package backtrackingProblems;

public class RatInAMaze {
	static int N;
	void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                    " " + sol[i][j] + " ");
            System.out.println();
        }
    }
  
	/* A utility function to check 
    if x, y is valid index for N*N maze */
    boolean isSafe(
        int maze[][], int x, int y)
    {
        
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);// if (x, y outside maze) return false
    }
	
	boolean solveMaze(int maze[][]) {
		int sol[][] = new int[N][N];
		
		if(solveMazeUtil(maze,0,0,sol)==false) {
			System.out.println("Solution doesn't Exists");
			return false;
		}
		printSolution(sol);
		return true;
	}
	
		boolean solveMazeUtil(int maze[][], int x, int y, int sol[][])
			{
			if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
			sol[x][y] = 1;  // if (x, y is goal) return true
			return true;
			}			
			if (isSafe(maze, x, y) == true) {// Check if maze[x][y] is valid
    
			if (sol[x][y] == 1)// Check if the current block is already part of solution path.
			    return false;

			sol[x][y] = 1;// mark x, y as part of solution path
			
			/* Move forward in x direction */
			if (solveMazeUtil(maze, x + 1, y, sol))
			  return true;
			
			/* If moving in x direction doesn't give 
			solution then Move down in y direction */
			if (solveMazeUtil(maze, x, y + 1, sol))
			  return true;
			
			/* If none of the above movements works then 
			BACKTRACK: unmark x, y as part of solution 
			path */
			sol[x][y] = 0;
			return false;
			}
			
			return false;
			}
	
	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
				N = maze.length;
		RatInAMaze rat = new RatInAMaze();
		rat.solveMaze(maze);

	}

}
