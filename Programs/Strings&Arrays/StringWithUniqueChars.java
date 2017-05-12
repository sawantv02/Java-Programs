package Programs;

public class StringWithUniqueChars {
	
	public static void main(String args[]){
		String s1="aabhndd";
		String s2="abcde";
		
		System.out.println(checkUnique(s1));
		System.out.println(checkUnique(s2));
		
		System.out.println("Check Duplicates using single loop ---------------------------");
		System.out.println(hasDuplicates(s1));
		System.out.println(hasDuplicates(s2));
			
	}
	
	public static boolean checkUnique(String s){
		char ch[]=s.toCharArray();
		char ch1[]=s.toCharArray();
		
		for(char c :ch){
			int count=0;
			for(char c1:ch1){
				if(c==c1){
					count++;
				}
				else continue;
			}
			
			if(count>1){
				return false;
			}
		}
		return true;
	}
	
	public static boolean hasDuplicates(String s){
		boolean ch[]=new boolean[26];
		
		char i[]=s.toLowerCase().toCharArray();
		
		for(char c:i){
			int pos= c- 'a';
			if(ch[pos])
				return false;
			else
				ch[pos]=true;
			
		}
		return true;
	}

}
