package Programs;

public class StringsWithKAnagrams {
	
	public static final int MAX_CHAR=26;
	public static void main(String args[]){
		String str1="geeks";
		String str2="eggzk";
		int k=2;
		
		System.out.println("Check if two strings are K-anagrams of each other:");
		System.out.println(checkIfStringsKAnagrams(str1, str2, k));
		
	}
	
	public static boolean checkIfStringsKAnagrams(String str1,String str2,int k){
		
		if(str1.length()!=str2.length())
			return false;
		
		int countarr[]=new int[MAX_CHAR];
		
		for(int i=0;i<str1.length();i++)
			countarr[str1.charAt(i)-'a']++;
		
		int count=0;
		
		for(int i=0;i<str2.length();i++){
			if(countarr[str2.charAt(i)-'a']>0)
				countarr[str2.charAt(i)-'a']--;
			else
				count++;
			
			if(count>k)
				return false;
		}

		return true;
	}

}
