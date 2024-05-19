package assignment4.ques4;

public class Program4 {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(10);
		l.addLast(20);
		l.addLast(30);
		l.display();
		l.rdisplay();
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
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else
			head = head.next;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
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
	
	public void rdisplay() {
		System.out.print("Reverse List: ");
		reversedata(head);
		System.out.println("");
	}
	
	public void reversedata(Node trav) {
		if(trav==null)
			return;
		reversedata(trav.next);
		System.out.print(trav.data+" ");
	}
}

