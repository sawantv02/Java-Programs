package Programs;

public class PrintAllSubstrings {
	
	public static void main(String args[]){
		String str="abcd";
		System.out.println("Print all substrings of a string:");
		printAllSubstrings(str);
	}
	
	public static void printAllSubstrings(String str){
		
		int n=str.length();
		
		for(int i=0;i<n;i++){
			
//		StringBuffer sb=new StringBuffer(str.toCharArray()[i]);
			int j=i+1;
			while(j<=n){
				String sb=str.substring(i,j);
				System.out.println(sb);
				j++;
			}
			
		}
	}

}
