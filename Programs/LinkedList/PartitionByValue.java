package LinkedList;

import java.util.HashSet;

public class PartitionByValue {
	
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(60);
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(40);
		l.addAtTail(30);
		l.addAtTail(50);
		l.elements();
		int partition=35;
		

		Node head=partitionByValue(partition, l.first,l);
		System.out.println("Partition linked list by value-----------------");
		l.display(head);
		
	}
	
	public static Node partitionByValue(int val,Node node,LinkedList l){
		Node beforestart=null;
		Node afterstart=null;
		
		while(node!=null){
			Node next=node.getNext();
			if(node.getValue()<val){
				node.setNext(beforestart);
				beforestart=node;
			}else{
				node.setNext(afterstart);
				afterstart=node;
			}
			node=next;
		}
		System.out.println("beforestart list----------");
		l.display(beforestart);
		
		System.out.println("afterstart list---------");
		l.display(afterstart);
		
		if(beforestart==null) return afterstart;
		
		Node head=beforestart;
		while(beforestart.getNext()!=null){
			beforestart=beforestart.getNext();
		}
		beforestart.setNext(afterstart);
		
		return head;
		
		
	}

}
