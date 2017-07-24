package Programs;

public class MimimumRotationsRequiredToGetSameString {

	public static void main(String args[]){
		String s="geeks";
		
		System.out.println("Minimum rotations required to get same string:");
		System.out.println(minimumRotationsRequired(s));
		
	}
	
	public static int minimumRotationsRequired(String s){
		
		String concat=s.concat(s);
		int index=1;
		for(int i=1;i<s.length();i++){
			if(!concat.substring(i,i+s.length()).equals(s)){
				index++;
			}
			else
				break;
		}
		
		return index;
	}
}
