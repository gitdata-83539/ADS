

import java.util.Scanner;

public class Program {
	
	public static int linearsearch(int arr[], int N, int key) {
		int comp = 0;
		for(int i = 0; i < N ; i++) {
			comp++;
			
			if(arr[i]==key)
			{
				System.out.println("No. of comparisions "+comp);
				return i;
			}
		}
		System.out.println("No. of comparisions "+comp);
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {40,20,30,40,50,60,20,80};
		System.out.println("Enter Key to Search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Key "+key+" at Index: "+linearsearch(arr, arr.length, key));
		sc.close();
		
	}

}
