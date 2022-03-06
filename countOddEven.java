import java.util.Scanner;

public class countOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elementn in array ");
		int arr[]  =  new int[10];
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Total Even numbers are :: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
		System.out.println();
		int count1=0;
		System.out.println("Total Odd numbers are :: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{

			count1++;
			}
			
		}
		System.out.println(count1);	
	

	}

}
