package org.vishakha.Fortinet.FortinetAssessment;


public class ReverseLinkedList {
	
	static Node instance=new Node();
	public static Node getInstance(){
		return instance;
	}
	
	public static void main(String args[]){

		Node n1=new Node();
		n1.value=10;
		Node n2=new Node();
		n2.value=20;
		Node n3=new Node();
		n3.value=30;
		Node n4=new Node();
		n4.value=40;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		System.out.println("Input linkedlist:");
		n1.display(n1);
		
		System.out.println("Reversed LinkedList:");
		Node rev=n1.reverseList(n1);
		n1.display(rev);
		
	}


}

class Node{
	Node next;
	int value;
	
	public Node reverseList(Node head){
		if(head==null || head.next==null)
			return head;
		Node remaining=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return remaining;
	}
	
	public void display(Node n) {
		Node head = n;
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	
}


