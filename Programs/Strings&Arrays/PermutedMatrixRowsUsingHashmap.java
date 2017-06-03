package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PermutedMatrixRows {

	public static void main(String args[]){
		int mat[][]={
				{4,2,3,1},
				{1,2,3,4},
				{8,5,6,7},
				{2,3,1,4}};
		
		int rownumber=3;
		
		System.out.println("Permuted rows in the matrix:"+findPermutedRows(mat, rownumber));
		
	}
	
	public static ArrayList<Integer> findPermutedRows(int mat[][],int row){
		ArrayList<Integer> rows=new ArrayList<>();
		HashMap<Integer,Boolean> map=new HashMap<>();

		System.out.println(map);
		for(int i=0;i<mat[0].length;i++){
			for(int n:mat[row]){
				map.put(n,false);
			}
			int count=0;
			for(int j=0;j<mat[0].length;j++){
				if(map.containsKey(mat[i][j]) && map.get(mat[i][j])==false)
					map.put(mat[i][j],true);
			}
			System.out.println(map);
			Iterator it=map.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry<Integer,Boolean> pair=(Map.Entry<Integer, Boolean>)it.next();
				if(pair.getValue()==true){
					count++;
				}
			}
			if(count==map.size() && i!=row)
				rows.add(i);

		}
		
		return rows;
	}
}
