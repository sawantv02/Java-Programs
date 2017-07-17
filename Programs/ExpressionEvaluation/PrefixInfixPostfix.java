package ExpressionEvaluation;

import java.util.Stack;

public class PrefixInfixPostfix {

	Stack<Character> opstack;
	String output;

	PrefixInfixPostfix() {
		this.opstack = new Stack();
		this.output = "";

	}

	public String infixToPostfix(String tokens) {
		String input[] = tokens.split(" ");
		for (String token : input) {
			char ch = token.charAt(0);
			if (Character.isLetterOrDigit(ch)) {
				output = output + ch;
			}

			else if (ch == '(') {
				opstack.push(ch);
			}

			else if (ch == ')') {
				char c=opstack.pop();
				while (c != '(') {
					output = output + c;
					c=opstack.pop();
				}
			} else {
				while ((!opstack.isEmpty()) && getPrecedence(opstack.peek()) >= getPrecedence(ch)) {
					char c = opstack.pop();
					output = output + c;
				}
				opstack.push(ch);
			}
		}

		while (!opstack.isEmpty()) {
			output = output + opstack.pop();
		}

		return output;
	}

	private int getPrecedence(char ch) {
		int prec = 0;
		switch (ch) {
		case '+':
		case '-': {
			prec = 2;
			break;
		}
		case '*':
		case '/': {
			prec = 3;
			break;
		}
		case '(': {
			prec = 1;
			break;
		}

		}

		return prec;
	}

}
