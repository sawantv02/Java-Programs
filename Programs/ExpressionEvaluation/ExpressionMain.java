package ExpressionEvaluation;

public class ExpressionMain {
	
	public static void main(String args[]){
		String expression="( A + B ) * C - ( D - E ) * ( F + G )";
		PrefixInfixPostfix p=new PrefixInfixPostfix();
		System.out.println("Expression:");
		
		System.out.println("Infix to Postfix:");
		String output=p.infixToPostfix(expression);
		System.out.print(output);
	}

}
