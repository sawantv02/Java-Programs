package Programs;

public class MatrixRowsCircularRotation {

	public static void main(String args[]) {

		int mat[][] = { { 1, 2, 3 }, { 3, 1, 2}, { 2, 3, 1 } };
		
		System.out.println("Check id matrix rows are in circular rotation:"+checkIfMatrixRowsCircularRotated(mat));
	}

	public static boolean checkIfMatrixRowsCircularRotated(int mat[][]) {
		StringBuffer str=new StringBuffer();
		
		for(int i:mat[0]){
			str.append(String.valueOf(i));
		}
		
		str.append(str);
		System.out.println(str);
		for(int i=0;i<mat.length;i++){
			StringBuffer strcheck=new StringBuffer();
			for(int j=0;j<mat[0].length;j++){
				strcheck.append(mat[i][j]);
			}
			System.out.println(strcheck);
			if(str.toString().contains(strcheck)==false){
				return false;
			}
		}
		
		return true;
	}
}
