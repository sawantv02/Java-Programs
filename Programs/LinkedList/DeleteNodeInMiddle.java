package LinkedList;

public class DeleteNodeInMiddle {

	public static void main(String args[]){		
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(40);
		l.addAtTail(50);
		l.addAtTail(60);
		
		
	}
	
	public static boolean deleteKthNode(Node k){
		if(k==null||k.getNext()==null)
			return false;
		Node next=k.next;
		k.setValue(next.getValue());
		k.setNext(next.getNext());
		return true;
	}
}
