

import java.util.Scanner;

public class Program {
	
	public static int descbinarysearch(int arr[],int left,int right, int key) {
		while(left<=right) {
			int mid = (left + right)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {80,70,60,50,40,30,20,10};
		System.out.println("Enter Key to Search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println("Key "+key+" at Index: "+descbinarysearch(arr, 0, (arr.length-1), key));
		sc.close();
	}

}
