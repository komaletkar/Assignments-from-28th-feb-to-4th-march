import java.util.Scanner;

public class swapNumbers {
	public class swapTwoNumbers {
		public static void swapNumber(int a,int b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swapping :: " + a+" " + b);
			
			
		}
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter numbers");
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        System.out.println("Before Swapping :: " + a + " " + b);
		        swapNumber(a,b);
			}

	}

}
