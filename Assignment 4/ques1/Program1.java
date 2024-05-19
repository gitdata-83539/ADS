
package assignment4.ques1;

public class Program1 {

	public static void main(String[] args) {
		List l = new List();
		
		l.addFirst(20);
		l.addLast(30);
		l.addFirst(10);
		l.dislpay();
		l.deleteFirst();
		l.deleteLast();
		l.dislpay();
	}
}

class List{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	
	public void dislpay() {
		System.out.print("List: ");
		for(Node trav = head; trav != null; trav=trav.next )
			System.out.print(trav.data+" ");
		System.out.println("");
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head=tail=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head=tail=newnode;
		else {
			tail.next = newnode;
			tail=newnode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head==tail)
			head=tail=null;
		else {
			head=head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head==tail)
			head=tail=null;
		else {
			Node trav;
			for(trav=head;trav.next!=tail;trav=trav.next);
			trav.next=null;
			tail=trav;
		}
	}
	
	public boolean isEmpty() {
		return (head==null && tail==null);
	}
}
