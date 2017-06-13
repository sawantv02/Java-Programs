package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class UncommonCharsOftwoStrings {
	
	public static void main(String args[]){
		String str1="geeksforgeeks";
		String str2="geeksquiz";
	
		System.out.println("Uncommon characters of two strings:");
		findUncommonChars(str1, str2);
	}
	
	public static void findUncommonChars(String str1,String str2){
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:str1.toCharArray()){

			if(map.containsKey(c)){
				int count=map.get(c);
				count=count+1;
				map.put(c,count);
			}
			else
				map.put(c,1);
		}
		
		System.out.println(map);
		
		for(char c:str2.toCharArray()){

			if(map.containsKey(c)){
				int count=map.get(c);
				count=count+1;
				map.put(c,count);
			}
			else
				map.put(c,1);
		}
		
		
		
		Iterator it=map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			if((Integer)pair.getValue()==1)
				System.out.println(pair.getKey());

		}
		
		
		
		
	}

}
