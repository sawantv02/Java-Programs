import java.util.HashMap;
import java.util.Map;

public class ArraySum {
	
	public static void main(String args[]){
		int arr[]={12,25,10,36,98,57,20};
		Map<Integer,Boolean> sum=new HashMap<>();
		Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		
		for(int n:arr)
			map.put(n,false);
		System.out.println(map);
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			int n1=arr[i];
			int n2=arr[j];
			sum.put(n1+n2,false);	
			}
		}
		System.out.println(sum);
		boolean flag=false;
		for(int n :sum.keySet())
			if(map.containsKey(n)){
				flag=true;
				System.out.println(n);
				break;
			}
		
		
		System.out.println(flag);
	}

}
