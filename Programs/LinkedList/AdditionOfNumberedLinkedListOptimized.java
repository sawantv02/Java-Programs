package LinkedList;

public class AdditionOfNumberedLinkedListOptimized {

	public static void main(String args[]){
		ListNode n1=new ListNode(3);
		ListNode n2=new ListNode(4);
		ListNode n3=new ListNode(2);
		n3.next=n2;
		n2.next=n1;
		
		ListNode l1=new ListNode(4);
		ListNode l2=new ListNode(6);
		ListNode l3=new ListNode(5);
		l3.next=l2;
		l2.next=l1;
		
		System.out.println("Addition of numbered linkedlist(reveresed) optimized:");
		ListNode a=addTwoNumbers(l3, n3);
		while(a!=null){
			System.out.println(a.val);
			a=a.next;
		}
		
	}
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
    }
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;};
}
