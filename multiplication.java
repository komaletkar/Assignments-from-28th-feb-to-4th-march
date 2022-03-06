import java.util.Scanner;

public class multiplication {

	public static int Intmultiplication(int a,int b,int c)
	{
		int mul=1;
		mul=a*b*c;
		return mul;
	}
	public static float floatmultiplication(float a,float b,float c)
	{
		float mul=1;
		mul=a*b*c;
		return mul;
	}
	public static long longmultiplication(long a,long b,long c)
	{
		long mul=1;
		mul=a*b*c;
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter numbers : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			Intmultiplication(a,b,c);
			floatmultiplication(a,b,c);
			longmultiplication(a,b,c);
			System.out.println(Intmultiplication(a,b,c));
			System.out.println(floatmultiplication(a,b,c));
			System.out.println(longmultiplication(a,b,c));
	

	}

}
