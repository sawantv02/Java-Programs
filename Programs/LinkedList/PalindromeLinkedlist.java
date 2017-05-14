package LinkedList;

import java.util.Stack;

public class PalindromeLinkedlist {
	
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail('m');
		l.addAtTail('a');
		l.addAtTail('d');
		l.addAtTail('a');
		l.addAtTail('m');
		l.charelements();
		System.out.println("Check if linkedlist is palindrom or not---------------------");
		System.out.println(checkPalindrome(l.first));
		
	}
	
	public static boolean checkPalindrome(Node head){
		Node slow=head;
		Node fast=head;
		
		Stack<Character> stack=new Stack<Character>();
		
		while(fast!=null && fast.getNext()!=null){
			stack.push(slow.getC());
			slow=slow.getNext();
			fast=fast.getNext().getNext();
		}
		if(fast!=null){
			slow=slow.getNext();
		}
		
		while(slow!=null){
			char top=stack.pop().charValue();
			if(top!=slow.getC())
				return false;
			
			slow=slow.getNext();
		}
		
		return true;
	}

}
