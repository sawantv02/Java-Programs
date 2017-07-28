package BinarySearchTree;

public class BinarySearch {

	Node root;
	int c=0;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.leftChild);
			System.out.println(root);
			inorderTraversal(root.rightChild);
		}
	}

	public void preorderTraversal(Node root) {
		if (root != null) {
			System.out.println(root);
			preorderTraversal(root.leftChild);
			preorderTraversal(root.rightChild);
		}
	}

	public void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.leftChild);
			postorderTraversal(root.rightChild);
			System.out.println(root);
		}
	}

	public Node findNode(int key) {
		Node focusNode = root;
		while (focusNode.key != key) {
			if (key < focusNode.key) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}

			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	public boolean deleteNode(int key) {
		Node focusNode = root;
		Node parent = root;

		boolean isLeftChild = true;

		while (focusNode.key != key) {
			parent = focusNode;

			if (key < focusNode.key) {
				isLeftChild = true;
				focusNode = focusNode.leftChild;
			} else {
				isLeftChild = false;
				focusNode = focusNode.rightChild;
			}

			if (focusNode == null) {
				return false;
			}
		}
		
		//end of while
		
		//when its root or leaf or do not have any children
		if(focusNode.leftChild==null && focusNode.rightChild==null){
			if(focusNode==root){
				root=null;
			}else if(isLeftChild==true){
				parent.leftChild=null;
			}else{
				parent.rightChild=null;
			}
		}
		
		else if(focusNode.rightChild==null){
			
			if(focusNode==root)
				root=focusNode.leftChild;
			else if(isLeftChild==true)
				parent.leftChild=focusNode.leftChild;
			else
				parent.rightChild=focusNode.leftChild;
		}
		
		else if(focusNode.leftChild==null){
			
			if(focusNode==root)
				root=focusNode.rightChild;
			else if(isLeftChild==true)
				parent.leftChild=focusNode.rightChild;
			else
				parent.rightChild=focusNode.leftChild;
		}
		
		else{
			
			Node replace=getReplaceNode(focusNode);
			
			if(focusNode==root){
				root=replace;
			}else if(isLeftChild==true)
				parent.leftChild=replace;
			else
				parent.rightChild=replace;
			
			replace.leftChild=focusNode.leftChild;
		}
		
		return true;

	}
	
	public Node getReplaceNode(Node replacedNode){
		Node replaceParent=replacedNode;
		Node replace=replacedNode;
		
		Node focusNode=replacedNode.rightChild;
		
		while(focusNode!=null){
			replaceParent=replace;
			replace=focusNode;
			focusNode=focusNode.leftChild;
		}
		
		if(replace!=replacedNode.rightChild){
			replaceParent.leftChild=replace.rightChild;
			replace.rightChild=replacedNode.rightChild;
		}
		
		return replace;
		
	}
	
	public int findDepth(Node node){
		if(node==null)
			return 0;
		else{
			int ldepth=findDepth(node.leftChild);
			int rdepth=findDepth(node.rightChild);
			
			if(ldepth>rdepth)
				return ldepth+1;
			else
				return rdepth+1;
		}
	}
	
	public void secondLargestElement(){	
		secondLargest(root);
		
	}
	
	private void secondLargest(Node node){
		
		if(node==null)
			return;	
		secondLargest(node.rightChild);
		c++;
		if(c==2){
			System.out.println(node.key);
			return;
		}
		secondLargest(node.leftChild);
	}
	
	
	public Node delete(Node root,int data){
		if(root==null) return null;
		if(data<root.key)
			root.leftChild=delete(root.leftChild, data);
		
		else if(data>root.key)
			root.rightChild=delete(root.rightChild, data);
		
		else{
			if(root.leftChild==null){
				return root.rightChild;
			}else if(root.rightChild==null){
				return root.leftChild;
			}
				Node temp=findMin(root.rightChild);
				root.key=temp.key;
				root.name=temp.name;
				root.rightChild=delete(root.rightChild,root.key);
			
		}
		return root;
	}
	
	private Node findMin(Node node){
		while(node.leftChild!=null)
			node=node.leftChild;
		return node;
	}
	
	public Node inOrderSuccessor(Node root,int data){
		if(root==null)
			return root;
		Node p=findNode(data);
		return successor(root, p);
			
	}
	
	private Node successor(Node root,Node p){
		if(root==null)
			return null;
		if(root.key<=p.key)
			return successor(root.rightChild, p);
		else{
			Node left=successor(root.leftChild, p);
			return (left!=null)?left:root;
		}
	}
	
	public Node inOrderPredecessor(Node root,int data){
		if(root==null)
			return root;
		Node p=findNode(data);
		return predecessor(root, p);
	}
	
	private Node predecessor(Node root,Node p){
		if(root==null)
			return null;
		if(root.key>=p.key)
			return predecessor(root.leftChild, p);
		else{
			Node right=predecessor(root.rightChild, p);
			return (right!=null)?right:root;
		}
	}

	public static void main(String args[]) {

		BinarySearch tree = new BinarySearch();
		tree.addNode(50, "Lion");
		tree.addNode(25, "Leopard");
		tree.addNode(15, "meercat");
		tree.addNode(35, "monkey");
		tree.addNode(75, "elephant");
		tree.addNode(65, "cheetah");
		tree.addNode(100, "tiger");
		
		System.out.println("Inorder Traversal:");
		tree.inorderTraversal(tree.root);

		System.out.println("Second Largest Element:");
		tree.secondLargestElement();
		
		System.out.println("Height of the tree:"+tree.findDepth(tree.root));

		System.out.println("Preorder Traversal:");
		tree.preorderTraversal(tree.root);

		System.out.println("Postorder Traversal:");
		tree.postorderTraversal(tree.root);

		System.out.println("Find node:");
		System.out.println(tree.findNode(15));
		
		System.out.println("Remove Node:");
		tree.delete(tree.root,50);
		
		System.out.println("Inorder Traversal:");
		tree.inorderTraversal(tree.root);
		
		System.out.println("Inorder successor:");
		System.out.println(tree.inOrderSuccessor(tree.root,25));

		System.out.println("Inorder predecessor:");
		System.out.println(tree.inOrderPredecessor(tree.root,35));
		
	}

}
