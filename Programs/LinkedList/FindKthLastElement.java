package LinkedList;

import java.util.HashMap;

public class FindKthLastElement {
	
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		l.addAtTail(10);
		l.addAtTail(20);
		l.addAtTail(30);
		l.addAtTail(40);
		l.addAtTail(50);
		l.addAtTail(60);
		
		int k=0;
		
		System.out.println("K'th last element in the linkedlist-------------");
		System.out.println(kthLastElement(k,l.first));
		
		System.out.println("K'th last element optimized---------------");
		System.out.println(kthLastOptimized(k,l.first));
		
	}
	
	public static int kthLastElement(int k,Node head){
		
		Node t=head;
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int index=0;
		int kvalue=0;
		if(t==null) return 0;
		else{
			while(t!=null){
				index++;
				map.put(index,t.getValue());
				t=t.getNext();
				
			}
//		System.out.println(map);
		if(k<=index)	
			kvalue=map.get(index-k);
		else return 0;
		return kvalue;
		}	
	}
	
	public static int kthLastOptimized(int k,Node head){
		
		if(k<0) return 0;
		
		Node p1=head;
		Node p2=head;
		
		for(int i=0;i<k;i++){
			p1=p1.getNext();
		}
		
		while(p1.getNext()!=null){
			p1=p1.getNext();
			p2=p2.getNext();
		}
		
		return p2.getValue();
	}

}
