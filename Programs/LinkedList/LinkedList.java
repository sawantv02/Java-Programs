package LinkedList;

public class LinkedList {

	public Node first;
	
	public void addAtTail(int n){
		Node t=new Node();
		t.setValue(n);
		
		if(first==null)
			first=t;
		
		else{
			Node last=first;
			while(last.getNext()!=null){
				last=last.getNext();
			}
			last.setNext(t);
		}
	}
	
	public boolean deleteNode(int n){
		Node t=first;
		Boolean flag=false;
		
		if(t.getValue()==n)
			first=t;
		
		while(t.getNext()!=null){
			if(t.getNext().getValue()==n){
				t.setNext(t.getNext().getNext());
				flag=true;
			}
			t=t.getNext();
		}
		return flag;
	}
	
    public void elements()
    {
        Node p=first;
        while(p!=null)
        {
            System.out.println(p.getValue());
            p=p.getNext();
        }
    }

	
	
}
