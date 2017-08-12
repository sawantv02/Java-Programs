package BackTracking;

public class FindPathInMaze {
	
	public static void main(String args[]){
		
		int mat[][]={{1,0,0,1},
				 {1,1,0,1},
				 {0,1,0,0},
				 {0,1,1,1}};
		
		System.out.println("Input Matrix:");
		printMatrix(mat);
		System.out.println("Solution:");
		solveMaze(mat);
	}
	
	public static boolean solveMaze(int mat[][]){
		int sol[][]=new int[mat.length][mat.length];
		if(!solveMazeUtil(mat, 0, 0, sol))
			return false;
		printMatrix(sol);
		
		return true;
	}
	
	public static void printMatrix(int mat[][]){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static boolean isSafe(int mat[][],int i,int j){
		if(i>=0 && i<mat.length && j>=0 && j<mat.length && mat[i][j]==1)
			return true;
		return false;
	}

	private static boolean solveMazeUtil(int mat[][],int i,int j,int sol[][]){
		if(i==(mat.length-1) && j==(mat.length-1)){
			sol[i][j]=1;
			return true;
		}
		if(isSafe(mat, i, j)==true){
			sol[i][j]=1;
			if(solveMazeUtil(mat, i+1, j, sol)) return true;
			if(solveMazeUtil(mat, i, j+1, sol)) return true;
			if(solveMazeUtil(mat, i-1, j, sol)) return true;
			if(solveMazeUtil(mat, i, j-1, sol)) return true;
			sol[i][j]=0;
			return false;
		}
		
		return false;
		
			
	}
}
