package Stack;

import java.util.Stack;

public class CheckForBalancedParentheses {

	public static void main(String args[]){
		String s="( { } ]";
		System.out.println("Check balanced parentheses in a String:");
		System.out.println(checkForBalancedParentheses(s));
	}
	
	public static boolean checkForBalancedParentheses(String s){
		String exp[]=s.split(" ");
		
		Stack<String> st=new Stack<String>();
		
		for(String str:exp){
			if(str.equals("("))
				st.push(")");
			else if(str.equals("["))
				st.push("]");
			else if(str.equals("{"))
				st.push("}");
			else if(!st.isEmpty() && str.equals(st.peek())){
				st.pop();
			}
			else
				return false;
		}
		
		return st.isEmpty();
		
	}
}

