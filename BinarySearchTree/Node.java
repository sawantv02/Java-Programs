package BinarySearchTree;

public class Node {

	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	public Node(int key,String name){
		this.key=key;
		this.name=name;
	}
	
	public String toString(){
		return "key is "+key+" for "+name;
		
	}
}
