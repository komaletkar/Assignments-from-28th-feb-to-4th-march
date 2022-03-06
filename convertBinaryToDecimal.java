import java.util.Scanner;

public class convertBinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int binary = sc.nextInt();
		int decimal=0;
		int n=0;
		while(binary>0)
		{
			int temp=binary%10;
			decimal=decimal+=temp*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
		System.out.println(decimal);

	}

}
