package assignment4.ques3;

public class Program3 {

	public static void main(String[] args) {
		List l = new List();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.addToNodeAfter(25, 20);
		l.addToNodeBefore(15, 20);
		l.dislpay();
	}

}

class List{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next=null;
		}
	}
	
	private Node head;
	
	public List() {
		head=null;
	}
	
	public void addFirst(int value) {
		Node newnode=new Node(value);
		if(isEmpty())
			head=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}	
	}
	
	public void addLast(int value) {
		Node newnode=new Node(value);
		if(isEmpty())
			head=newnode;
		else {
			Node trav;
			for(trav=head;trav.next!=null;trav=trav.next);
			trav.next=newnode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else
			head=head.next;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			Node trav;
			for(trav=head;trav.next.next!=null;trav=trav.next);
			trav.next=null;
		}
	}
	
	public void addToNodeAfter(int value, int var) {
		Node newnode = new Node(value);
		Node trav;
		for(trav=head; trav!=null && trav.data!=var;trav=trav.next);
		if(trav==null) {
			System.out.println("Node not found");
			return;
		}	
		newnode.next=trav.next;
		trav.next=newnode;	
	}
	
	public void addToNodeBefore(int value, int var) {
		Node newnode = new Node(value);
		Node trav;
		for(trav=head; trav.next!=null; trav=trav.next) {
			if(head.data==var) {
				addFirst(value);
				return;
			}
			else if(trav.next.data==var){
				break;
			}
		}	
		if(trav.next==null) {
			System.out.println("Node not found");
			return;
		}	
		newnode.next=trav.next;
		trav.next=newnode;	
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void dislpay() {
		Node trav=head;
		System.out.print("List: ");
		do { 
			System.out.print(trav.data+" ");
			trav=trav.next;
		}while(trav!=null);
		System.out.println("");
	}
}