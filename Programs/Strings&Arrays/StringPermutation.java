package Programs;

import java.util.HashSet;

public class StringPermutation {

	public static void main(String args[]){
		String s1="abcde";
		String s2="adebc";
		
		System.out.println("check permutation:"+checkPermutation(s1, s2));
		
		
	}
	
	public static boolean checkPermutation(String s1,String s2){
		
		HashSet<Character> check=new HashSet<>();
		char ch1[]=s1.toLowerCase().toCharArray();
		
		for(char c:ch1){
			check.add(c);
		}
		
		if(s1.length()!=s2.length())
			return false;
		char ch2[]=s2.toLowerCase().toCharArray();
		for(char c2:ch2){
			if(check.contains(c2)){
				continue;
			}
			else 
				return false;
		}
		
		return true;
	}
}
