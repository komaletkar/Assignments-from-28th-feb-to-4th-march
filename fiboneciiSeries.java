import java.util.Scanner;

public class fiboneciiSeries {
	public static void fiboneciiSeries(int n)
	{
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
		  c=a+b;
		  a=b; 
		  b=c;
		  System.out.println(c);
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int n=sc.nextInt();
		fiboneciiSeries(n);
		
	}

}
