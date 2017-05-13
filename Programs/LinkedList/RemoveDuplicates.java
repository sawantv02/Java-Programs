package LinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(30);
		l.addAtTail(50);
		
		System.out.println("Nodes added------------------");
		l.elements();
		
//		removeDuplicate(l);
//		System.out.println("Duplicates removed--------------");
//		l.elements();
//		
		
		System.out.println("Duplicates removed without buffer----------");
		removeDuplicateWithoutBuffer(l.first);
		l.elements();
		
		
	}
	
	public static void removeDuplicate(LinkedList l){
		
		Node t=l.first;
		Node prev=null;
		HashSet<Integer> map=new HashSet<Integer>();
		
		while(t.getNext()!=null){
			if(map.contains(t.getValue()))
				prev.setNext(t.getNext());
			else{
				map.add(t.getValue());
				prev=t;
			}			
			t=t.getNext();
		}

	}
	
	public static void removeDuplicateWithoutBuffer(Node head){
		if(head==null) return;
		Node current=head;
		while(current!=null){
			Node runner=current;
			while(runner.getNext()!=null){
				if(runner.getNext().getValue()==current.getValue()){
					runner.setNext(runner.getNext().getNext());
				}
				else
					runner=runner.getNext();
			}
			current=current.getNext();
		}
	}
}
