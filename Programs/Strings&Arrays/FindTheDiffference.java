package Programs;

public class FindTheDiffference {

	public static void main(String args[]){
		String a="abcd";
		String b="abcde";
		
		System.out.println(findTheDifference(a, b));
	}
	
	public static char findTheDifference(String a,String b){

		int charsa=0;
		int charsb=0;
		
		for(int i=0;i<a.length();i++)
			charsa+=a.charAt(i);
		for(int j=0;j<b.length();j++)
			charsb+=b.charAt(j);
		
		return (char)(Math.abs(charsa-charsb));
		
	}
}
