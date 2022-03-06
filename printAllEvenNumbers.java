import java.util.Scanner;

public class printAllEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elementn in array ");
		int arr[]  =  new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers are :: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}

		

	}


}
