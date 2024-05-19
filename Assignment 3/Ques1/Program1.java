package Assignment3.Ques1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Thank you");
				break;
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					st.push(value);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped value : " + st.pop()); 
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked value : " + st.peek());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(choice != 0);
		sc.close();
	}

}

class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	public void push(int value) {
		top--;
		arr[top] = value;
	}
	public int pop() {
		return arr[top++];
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty(){
		return top == SIZE;
	}
	public boolean isFull() {
		return top == 0;
	}
}

