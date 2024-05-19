

public class Program {
	
	public static int firstnonrepeat(int arr[],int N) {
		int flag=0;
		for(int i =0;i<N;i++) {
			flag=0;
			for(int j=0;j<N;j++) {
				if(arr[i]==arr[j])
					flag++;
			}
			if(flag==1)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {40,20,80,40,20,70,30,80};
		int result = firstnonrepeat(arr, arr.length);
		if(result!=-1)
			System.out.println("First Non Repeating number is "+ result);
		else
			System.out.println("No Non Repeating");
	}

}
