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
		
		System.out.println("Reveresing the list:");
		l.reverseLinkedList(l.first);
	}

}
