package assignment4.ques2;

public class Program2 {

	public static void main(String[] args) {
		List l = new List();
		l.AddFirst(30);
		l.AddFirst(20);
		l.AddFirst(10);
		l.dislpay();
		
		l.AddLast(40);
		l.AddLast(50);
		l.dislpay();
		
		l.DeleteFirst();
		l.DeleteLast();
		l.dislpay();
		
		l.AddPos(25, 3);
		l.dislpay();
		
		l.DeletePos(3);
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
		
		private Node tail=null;
		private int count=0;
		
		public void AddFirst(int value) {
			Node newNode = new Node(value);
			if(tail==null) {
				tail=newNode;
				tail.next=newNode; 
			}
			else {
				newNode.next=tail.next;
				tail.next=newNode;
			}
			count++;
		}
		
		public void AddLast(int value) {
			Node newNode = new Node(value);
			if(tail==null) {
				tail=newNode;
				tail.next=newNode; 
			}
			else {
				newNode.next=tail.next;
				tail.next=newNode;
				tail=newNode;
			}
			count++;
		}
		
		public void AddPos(int value,int pos) {
			Node newNode = new Node(value);
			if(pos < 1)
				AddFirst(value);
			else if(pos > count+1)
				AddLast(value);
			else {
				Node trav=tail;
				for(int i=1;i<pos;i++)
					trav=trav.next;
				newNode.next=trav.next;
				trav.next=newNode;
			}
		}
		
		
		public void DeleteFirst() {
			if(tail==null)
				return;
			else if(tail.next == tail)
				tail=null;
			else
				tail.next= tail.next.next;
			count--;
		}
		
		public void DeleteLast() {
			if(tail==null)
				return;
			else if(tail.next == tail)
				tail=null;
			else {
				Node trav;
				for(trav=tail;trav.next!=tail;trav=trav.next);
				trav.next=tail.next;
				tail=trav;		
			}
			count--;
		}
		
		public void DeletePos(int pos) {
			if(pos<1)
				DeleteFirst();
			else if(pos>count)
				DeleteLast();
			else {
				Node trav=tail;
				for(int i=1;i<pos;i++)
					trav=trav.next;
				trav.next=trav.next.next;
			}
		}
		
		public void dislpay() {
			Node trav=tail;
			System.out.print("List: ");
			do {
				trav=trav.next;
				System.out.print(trav.data+" ");
			}while(trav!=tail);
			System.out.println("");
			
		}
}