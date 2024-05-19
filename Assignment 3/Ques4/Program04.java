package Assignment3.Ques4;

import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					q.push(value);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					q.pop();
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked value : " + q.peek());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice != 0);
		sc.close();
	}
}

class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	private int count=0;
	
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int value) {
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		count++;
	}
	
	public int pop() {
		int temp = arr[(front + 1) % SIZE];
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
		count--;
		return temp;
	}
	
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
	
}