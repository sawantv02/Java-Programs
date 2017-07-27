package Programs;

import java.util.Stack;

public class StringReverseUsingStack {
	
	public static void main(String args[]){
		
		String s="vishakha";
		
		System.out.println("Reverse string using stack:");
		System.out.println(reverseStringUsingStack(s));
	}

	public static String reverseStringUsingStack(String s){
		
		Stack<Character> st=new Stack<>();
		String result="";
		for(char ch:s.toCharArray())
			st.push(ch);
		
		while(!st.isEmpty())
			result=result+st.pop();
		
		return result;
	}
}
