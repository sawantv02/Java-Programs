package LinkedList;

public class Node {
    
    public int value;
    public Node next;
    
    public void setValue(int v)
	{
		value=v;
	}
    public int getValue()
	{
		return value;
	}
    public void setNext(Node x)
	{
		next=x;
	}
    public Node getNext()
	{
		return next;
	}
}