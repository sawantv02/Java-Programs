package LinkedList;

public class LinkedListIntersection {

	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
//		l.addAtTail(30);
//		l.addAtTail(40);
//		l.addAtTail(50);
		
		System.out.println("list 1---------");
		l.elements();
		Node head=l.first;
		
		LinkedList l1=new LinkedList();
//		l1.addAtTail(10);
//		l1.addAtTail(20);
		

		l1.first=head.getNext();
		Node head1=l1.first;
		l1.addAtTail(40);
		l1.addAtTail(50);

		
		System.out.println("list 2----------");
		l1.elements();

		
		System.out.println("Get intersection Node in linkedlist");
		System.out.println(getIntersection(head, head1).value);
		
	}
	

	
	public static Node getIntersection(Node headA,Node headB){
		
		if(headA==null || headB==null) return null;
		Node a=headA;
		Node b=headB;
		
		while(a!=b){
			a=a==null?headB:a.next;
			b=b==null?headA:b.next;
		}
		
		return a;
	}
}
