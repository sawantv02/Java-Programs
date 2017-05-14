package LinkedList;

public class AdditionOfNumberedLinkedlist {
	public static void main(String args[]){
		LinkedList num1=new LinkedList();
		num1.addAtTail(7);
		num1.addAtTail(1);
		num1.addAtTail(6);
		
		LinkedList num2=new LinkedList();
		num2.addAtTail(5);
		num2.addAtTail(9);
		num2.addAtTail(2);
		
		System.out.println("Addition of two number(reveresed) in the linkedlist------------");
		LinkedList sum=addNumbersReverse(num1, num2);
		sum.elements();
		
		LinkedList number1=new LinkedList();
		number1.addAtTail(6);
		number1.addAtTail(1);
		number1.addAtTail(7);
		
		LinkedList number2=new LinkedList();
		number2.addAtTail(2);
		number2.addAtTail(9);
		number2.addAtTail(5);
		
		System.out.println("Addition of two numbers in the linkedlist----------------");
		LinkedList sum1=addNumbers(number1, number2);
		sum1.elements();
		
		
		
	}
	
	public static LinkedList addNumbersReverse(LinkedList num1,LinkedList num2){
		
		LinkedList sum=new LinkedList();
		
		Node head1=num1.first;
		Node head2=num2.first;
		
		StringBuffer n1=new StringBuffer();
		StringBuffer n2=new StringBuffer();
		
		if(head1==null || head2==null){
			return null;
		}
		
		while(head1!=null){
			n1.insert(0,head1.getValue());
			head1=head1.getNext();
		}
		
		while(head2!=null){
			n2.insert(0,head2.getValue());
			head2=head2.getNext();
		}
		
		int addition=Integer.parseInt(n1.toString())+Integer.parseInt(n2.toString());
		
		while(addition>0){
			sum.addAtTail(addition%10);
			addition=addition/10;
		}
		
		return sum;
	}
	
	public static LinkedList addNumbers(LinkedList num1,LinkedList num2){
		
		LinkedList sum=new LinkedList();
		
		Node head1=num1.first;
		Node head2=num2.first;
		
		StringBuffer n1=new StringBuffer();
		StringBuffer n2=new StringBuffer();
		
		if(head1==null || head2==null){
			return null;
		}
		
		while(head1!=null){
			n1.append(head1.getValue());
			head1=head1.getNext();
		}
		
		while(head2!=null){
			n2.append(head2.getValue());
			head2=head2.getNext();
		}
		
		int addition=Integer.parseInt(n1.toString())+Integer.parseInt(n2.toString());
		
		while(addition>0){
			sum.addAtTail(addition%10);
			addition=addition/10;
		}
		
		return sum;
	}

}
