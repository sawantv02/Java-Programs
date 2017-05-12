package Programs;

public class SubstringCheckforRotation {

	public static void main(String args[]){
		String s1="waterbottle";
		String s2="erbottlewat";
//		String s2="abc";
		
		System.out.println("Check if substring exits in rotated string by calling isSubstring just once------");
		System.out.println(checkSubstring(s1, s2));
	}
	
	public static boolean checkSubstring(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		StringBuffer br=new StringBuffer();
		br.append(s1);
		br.append(s1);
		
		return isSubstring(br.toString(),s2);
	}
	
	public static boolean isSubstring(String s1,String s2){
		if(s1.indexOf(s2)!=-1)
			return true;
		return false;
	}
}
