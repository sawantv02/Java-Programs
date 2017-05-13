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
		
		removeDuplicate(l);
		System.out.println("Duplicates removed--------------");
		l.elements();
		
	}
	
	public static void removeDuplicate(LinkedList l){
		
		Node t=l.first;
		
		HashSet<Integer> map=new HashSet<Integer>();
		
		while(t.getNext()!=null){
			if(map.contains(t.getValue()))
				l.deleteNode(t.getValue());
			else
				map.add(t.getValue());
			t=t.getNext();
		}

	}
	
	public static void removeDuplicateWithoutBuffer(LinkedList l){
		
	}
}
