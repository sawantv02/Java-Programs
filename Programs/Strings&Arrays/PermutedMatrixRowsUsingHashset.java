package Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutedMatrixRows {

	public static void main(String args[]){
		int mat[][]={
				{4,2,3,1},
				{1,2,3,1},
				{8,5,6,7},
				{2,3,1,4}};
		
		int rownumber=3;
		
		System.out.println("Permuted rows in the matrix:"+findPermutedRows(mat, rownumber));
		
	}
	
	public static ArrayList<Integer> findPermutedRows(int mat[][],int row){
		ArrayList<Integer> rows=new ArrayList<>();
		HashSet<Integer> set=new HashSet<>();
		for(int n:mat[row]){
			set.add(n);
		}
		System.out.println(set);
		for(int i=0;i<mat[0].length;i++){
			HashSet<Integer> count=new HashSet<>();
			for(int j=0;j<mat[0].length;j++){
				if(set.contains(mat[i][j]))
					count.add(mat[i][j]);
			}
			if(count.size()==set.size() && i!=row)
				rows.add(i);
		}
		
		return rows;
	}
}
