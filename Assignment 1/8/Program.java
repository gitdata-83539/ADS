

import java.util.Scanner;

public class Program {
	
	public static int rankOfElement(int arr[],int N, int element) {
		int count = 0;
		for(int i =0;i<N;i++) {
			if(arr[i]==element || arr[i]<element) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {40,20,30,10,50,60,20,80};
		System.out.println("Enter Key to Search: ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int rank = rankOfElement(arr, arr.length, element);
		System.out.println("Rank of "+element+" is "+rank);
		sc.close();
	}

}
