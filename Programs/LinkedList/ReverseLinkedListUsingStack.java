package LinkedList;

import java.util.Stack;

public class ReverseLinkedListUsingStack {

	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(40);
		l.addAtTail(50);
		l.addAtTail(60);

		l.printUsingRec(l.first);
		System.out.println();
		System.out.println("Reverse LinkedList using stack:");
		Node result = reverseLinkedListUsingStack(l.first);
		l.printUsingRec(result);

	}

	public static Node reverseLinkedListUsingStack(Node root) {
		Stack<Node> stack = new Stack<>();
		if (root == null)
			return null;
		while (root != null) {
			Node temp = root.next;
			if (stack.isEmpty()) {
				root.next = null;
				stack.push(root);
			} else {
				root.next = stack.peek();
				stack.push(root);
			}
			root = temp;
		}

		return stack.peek();
	}
}
