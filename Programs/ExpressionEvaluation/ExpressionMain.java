package ExpressionEvaluation;

public class ExpressionMain {
	
	public static void main(String args[]){
		String expression="( A + B ) * ( C + D )";
		PrefixInfixPostfix p=new PrefixInfixPostfix();
		System.out.println("Expression:"+expression);
		
		System.out.print("Infix to Postfix: ");
		String output=p.infixToPostfix(expression);
		System.out.print(output);
		
		System.out.println();
		
		System.out.print("Infix to Prefix: ");
		String op=p.infixToPrefix(expression);
		System.out.print(op);
		
	}

}
