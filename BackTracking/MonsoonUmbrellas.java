package BackTracking;

import java.util.Arrays;

public class MonsoonUmbrellas {

	public static void main(String args[]){
		
		int n=4;
		int types[]={2,4};
		
		System.out.println("Number of minimum monsoon umbrellas needed for "+n+" people with umbrellas of types "+Arrays.toString(types)+" is "+numberOfUmbrellas(n, types));
	}
	
	public static int numberOfUmbrellas(int n,int types[]){
		
		Arrays.sort(types);
		int result=Integer.MAX_VALUE;
		int min=0;
		min=findNumbers(result,0,types,n,0);
//		System.out.println("min:"+min);
		return (min<Integer.MAX_VALUE)?min:-1;
		
		
		
	}
	
	private static int findNumbers(int min,int tempmin,int types[],int n,int start){
		if(n<0)
			return Integer.MAX_VALUE;
		if(n==0){
			min=(tempmin<min)?tempmin:min;
//			System.out.println(min);
			return min;
		}
		else{
			int count=min;
			for(int i=start;i<types.length;i++){
				tempmin+=1;
				count=Math.min(count,findNumbers(min,tempmin,types,n-types[i],i));
				tempmin-=1;
			}
			return count;
		}
	}
}
