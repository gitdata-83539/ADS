

import java.util.Scanner;

public class Program {
	
	public static int linearsearchOpp(int arr[], int N, int key) {
		for(int i = N-1; i>-1;i--) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {40,20,30,40,50,60,20,80};
		System.out.println("Enter Key to Search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Key "+key+" at Index: "+linearsearchOpp(arr, arr.length, key)+" (from last)");
		sc.close();
	}

}
