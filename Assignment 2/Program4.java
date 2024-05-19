package Assignment2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		Scanner sc = new Scanner(System.in);
		int choice,value;
		do {
			System.out.println("0.Exit \n1.Push \n2.Pop \n3.Peek \nEnter the Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You");
				break;
			case 1:
				System.out.println("Enter the Element: ");
				value=sc.nextInt();
				q.Push(value);
				break;
			case 2:
				q.Pop();
				break;
			case 3:
				value= q.Peek();
				if(value==-1)
					System.out.println("Empty Queue");
				else
					System.out.println("Peeked Element is "+value);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}

class Queue{
	int arr[];
	int rear;
	int front;
	int Size;
	
	public Queue(int Size) {
		this.Size  = Size;
		arr= new int[Size];
		rear=0;
		front=0;
	}
	
	public void Push(int value) {
		if(this.isFull())
			System.out.println("Queue is Full");
		else {
			arr[rear]=value;
			rear++;
		}
	}
	
	public void Pop() {
		if(this.isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
		front++;
		}
	}
	
	public int Peek() {
		if(this.isEmpty()) {
			return -1;
		}
		else
		return arr[front];
	}
	
	public boolean isFull() {
		if(rear == Size)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(rear!=0)
			if(rear < front || front == Size)
				return true;
		return false;
	}
}
