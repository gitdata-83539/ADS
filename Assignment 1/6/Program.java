

import java.util.Scanner;

public class Program {
	
	public static int linearsearch(int arr[],int N, int key,int occurence) {
		int x=1;
		for(int i =0; i < N; i++) {
			if(arr[i]==key) {
				if(x==occurence){
					return i; 
				}
				x++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,5,3,6,7,3,7,21,8,9,3,2,2,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key =sc.nextInt();
		System.out.println("Enter the occurence");
		int n =sc.nextInt();
		int result = linearsearch(arr, arr.length, key, n);
		System.out.println("Key "+key+" at Index: "+result +" ( in "+n+"th occurence)");
		sc.close();
	}

}
