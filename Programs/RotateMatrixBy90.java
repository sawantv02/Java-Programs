package Programs;

public class RotateMatrixBy90 {

	public static void main(String args[]){
		int[][] mat={{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		
		printMatrix(mat);

		rotateRightBy90(mat);
		
		
	}
	
	public static void rotateRightBy90(int[][] matrix){
		int[][] mat=transposeMatrix(matrix);
		System.out.println("Matrix rotated right by 90 degrees------------");
		for(int j=0;j<mat[0].length/2;j++){
			for(int i=0;i<mat.length;i++){
				int tmp=mat[i][j];
				mat[i][j]=mat[i][mat[0].length-1-j];
				mat[i][mat[0].length-1-j]=tmp;
			}
		}
		printMatrix(mat);
	}
	
	public static void printMatrix(int [][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transposeMatrix(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=i;j<mat[0].length;j++){
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		System.out.println("Transpose:---------------");
		printMatrix(mat);
		return mat;
	}
}
