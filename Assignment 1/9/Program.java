

import java.util.Arrays;

public class Program {
	
	public static void selectionSort(int arr[], int N) {
		int comp=0;
		for(int i =0; i<N-1; i++) {
			for(int j=i+1; j<N;j++) {
				if( arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					comp++;
				}
			}
		}
		System.out.println("No. of Comparisions is "+comp);
	}

	public static void main(String[] args) {
		int arr[] = {40,20,30,10,50,60,20,80};
		selectionSort(arr, arr.length);
		System.out.println("Final "+Arrays.toString(arr));
	}

}
