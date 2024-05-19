package Assignment3.Ques2;

import java.util.Scanner;


public class Program2 {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Max of Stack");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
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
			case 4:	
				if(st.isEmpty())
					System.out.println("Stack is Empty");
				else
					System.out.println("Maximum of Queue"+st.maxItem());
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

	private int size;
	private int top;
	private int arr[];
	private int max[];
	private int maxtop;
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		max=new int[size];
		maxtop=top=-1;
		max[top+1]=0;		
	}
	
	public void push(int value)
	{
		top++;
		maxtop++;
		arr[top]=value;
		if(max[maxtop]<=value)
			max[maxtop]=value;
	}
	
	public int pop()
	{int item=arr[top--];
	if(item==max[maxtop])
	   maxtop--;
	return item;
	}
	
	public int peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public int maxItem()
	{
		return max[maxtop];
	}
}