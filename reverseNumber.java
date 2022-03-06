import java.util.Scanner;

public class reverseNumber {
	public class reverseNumByMethod {
		public static void reverseNumber(int n)
		{
			int rev=0;
			while(n>0)
			{
				int last=n%10;
				rev=rev*10+last;
				n=n/10;
			}
			System.out.println(rev);
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			
			reverseNumber(n);

		}
	}

}
