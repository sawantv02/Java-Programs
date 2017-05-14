package LinkedList;

public class NodeAtLoopStart {
	
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(60);
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(40);
		l.addAtTail(30);
		l.addAtTail(50);
		
		Node head=l.first;
		//making the list circular
		head.getNext().getNext().getNext().getNext().getNext().setNext(head.getNext().getNext());
		
		System.out.println("Find start of the loop in circular linkedlist");
		System.out.println(nodeAtLoopStart(l.first));
		
		
	}

	public static int nodeAtLoopStart(Node head){
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.getNext()!=null){
			slow=slow.getNext();
			fast=fast.getNext().getNext();
			
			if(slow==fast){
				break;
			}
		}
		
		if(fast==null || fast.getNext()==null){
			return 0;
		}
		
		slow=head;
		while(slow!=fast){
			slow=slow.getNext();
			fast=fast.getNext();
		}
		
		return fast.getValue();
		
		
	}
}
