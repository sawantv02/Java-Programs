package LinkedList;

public class Node {
    
    public int value;
    public Node next;
    public char c;
    
    public void setValue(int v)
	{
		value=v;
	}
    public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
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