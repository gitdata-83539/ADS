package assignment4.ques5;

public class Program5 {

	public static void main(String[] args) {
		List l = new List();
		l.addData(100);
		l.addData(30);
		l.addData(20);
		l.addData(60);
		l.addData(50);
		l.addData(40);
		l.display();
	}

}

class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void addData(int value) {
		Node newnode = new Node(value);
		if(head==null)
			head=newnode;
		else if(head.data>value) {
			newnode.next=head;
			head=newnode;
		}
		else {
		Node trav;
		for(trav=head;trav.next!=null && trav.next.data<value;trav=trav.next);
			newnode.next=trav.next;
			trav.next=newnode;
		}
	}
	
	public void display() {
		Node trav=head;
		System.out.print("List: ");
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("");
	}
}