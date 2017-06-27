package Programs;

public class TowerOfHanoi {
	
	public static void main(String args[]){
		int n=5;
		System.out.println("Tower of Hanoi:");
		move(n,"A","B","C");
		
		
	}
	
	public static void move(int n,String source,String aux,String target){
		if(n==1){
			System.out.println(source+"->"+target);
		}else{
			move(n-1,source,target,aux);
			System.out.println(source+"->"+target);
			move(n-1,aux,source,target);
			
		}
		
	}

}
