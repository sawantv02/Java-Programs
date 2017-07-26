package LinkedList;

public class ReverseList {
	
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(40);
		l.addAtTail(50);
		l.addAtTail(60);
		l.display(l.first);
		
		System.out.println("Printing using recurrsion:");
		l.printUsingRec(l.first);
		System.out.println();
		
		System.out.println("Printing in reverse:");
		l.reversePrintUsingRec(l.first);
		
		System.out.println();
		System.out.println("Reveresing the list:");
		Node rev=l.reverseLinkedList(l.first);
		l.printUsingRec(rev);
		
		System.out.println();
		System.out.println("Reversing the list using recurrsion:");
		Node head=l.reverseUsingRec(rev);
		l.printUsingRec(head);
	}
	

}
