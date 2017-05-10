package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCompression {

	public static void main(String args[]){
		String s="aabbbbcccdddddd";
//		String s="abcd";
		
		System.out.println("Compressed String:-----------------------");
		System.out.println(compressedString(s));
		
	}
	
	public static String compressedString(String s){
		Map<Character,Integer> com=new HashMap<Character,Integer>();
		
		char ch[]=s.toLowerCase().toCharArray();
		for(char c:ch){
			if(com.containsKey(c)){
				int count=com.get(c);
				com.put(c,count+1);
			}
			else
				com.put(c,1);
		}
		Iterator it=com.entrySet().iterator();
		StringBuffer br=new StringBuffer();
		while(it.hasNext()){
			Map.Entry<Character,Integer> pair=(Map.Entry<Character,Integer>)it.next();
			br.append(pair.getKey().toString()+pair.getValue());
		}
		
		if(br.length()>s.length())
			return s;
		else
			return br.toString();
		
		
	}
}
