import java.util.Scanner;

public class findMiddleElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elementn in array ");
		int arr[]  =  new int[10];
		int n=arr.length;
		int mid=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(n%2==1)
			{
				mid=arr[(n+1)/2-1];
			}
			else
			{
				mid=(arr[n/2-1]+arr[n/2])/2;
			}
		}
		System.out.println(mid);
		}

}
