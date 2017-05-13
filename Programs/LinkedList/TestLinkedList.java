package LinkedList;

public class TestLinkedList {

	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(40);
		l.addAtTail(50);
		
		System.out.println("Nodes added------------------");
		l.elements();
		
		Boolean flag=l.deleteNode(30);
		System.out.println("Node deleted:"+flag);
		l.elements();
		
		
		
	}
}
