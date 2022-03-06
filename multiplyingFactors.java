import java.util.Scanner;

public class multiplyingFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elementn in array ");
		int arr[]  =  new int[10];
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element You Want");
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]%d==0)
			{
			  System.out.println("Myltiplying factors are :: " + arr[i]);
			}
			
		}

	}

}
