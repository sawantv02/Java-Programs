package Programs;

public class StaircaseHopping {
	static int cache[]=new int[1000];

	public static void main(String args[]){
		
		int n=13;
		System.out.println("Staircase Hopping for 1,2 or 3 steps-----------");
		System.out.println(staircaseHop(n));
		
	}
	
	public static int staircaseHop(int n){
		if(n==0) return 1;
		if(n<0) return 0;
		if(cache[n]!=0) return cache[n];
		cache[n]= staircaseHop(n-1)+staircaseHop(n-2)+staircaseHop(n-3);
		return cache[n];
	}
}
