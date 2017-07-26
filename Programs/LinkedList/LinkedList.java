package LinkedList;

public class LinkedList {

	public Node first;

	public void addAtTail(int n) {
		Node t = new Node();
		t.setValue(n);

		if (first == null)
			first = t;

		else {
			Node last = first;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(t);
		}
	}

	public void addAtTail(char n) {
		Node t = new Node();
		t.setValue(n);

		if (first == null)
			first = t;

		else {
			Node last = first;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(t);
		}
	}

	public boolean deleteNode(int n) {
		Node t = first;
		Boolean flag = false;

		if (t.getValue() == n)
			first = t;

		while (t.getNext() != null) {
			if (t.getNext().getValue() == n) {
				t.setNext(t.getNext().getNext());
				flag = true;
			}
			t = t.getNext();
		}
		return flag;
	}

	public void elements() {
		Node p = first;
		while (p != null) {
			System.out.println(p.getValue());
			p = p.getNext();
		}
	}

	public void display(Node n) {
		Node head = n;
		while (head != null) {
			System.out.println(head.getValue());
			head = head.getNext();
		}
	}

	public void charelements() {
		Node p = first;
		while (p != null) {
			System.out.println(p.getC());
			p = p.getNext();
		}
	}

	public Node reverseLinkedList(Node node) {
		Node current=node;
		Node prev=null;
		Node next=null;
		while (current!= null){
		next = current.next;
		current.next=prev;
		prev = current;
		current=next;
		}
		
		node=prev;
		
		return node;
//		display(node);
	}
	
	public void printUsingRec(Node root){
		if(root==null)
			return;
		System.out.print(root.value+" ");
		printUsingRec(root.next);
	}
	
	public void reversePrintUsingRec(Node root){
		if(root==null)
			return;
		reversePrintUsingRec(root.next);
		System.out.print(root.value+" ");
	}
	
	
	
	public Node reverseUsingRec(Node current){
		if(current==null || current.next==null)
			return current;
		Node remaining=reverseUsingRec(current.next);
		current.next.next=current;
		current.next=null;
		return remaining;

	}
}
