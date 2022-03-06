import java.util.Scanner;

public class maxNum {
	public static int Maxnum(int a,int b) {
		int Maxnum=(a>b)?a:b;
		return Maxnum;
	}
	public static int Maxnum1(int a,int b,int c) {
		int Maxnum1=(a>b)?a:(b>c)?b:c;
		return Maxnum1;
	}
	public static int Maxnum2(int a,int b,int c,int d) {
		int Maxnum2=(a>b)?a:(b>c)?b:(c>d)?c:d;
		return Maxnum2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre first number ::");
		int a=scan.nextInt();
		System.out.println("Entre second number ::");
		int b=scan.nextInt();
		System.out.println("Entre third number ::");
		int c=scan.nextInt();
		System.out.println("Entre fourth number ::");
		int d=scan.nextInt();
		int result1=Maxnum(a,b);
		System.out.println("Maximum number between two numbers"+" from "+a+" and "+b+" is "+result1);
		int result2=Maxnum1(a,b,c);
		System.out.println("Maximum number between three numbers"+" from "+a+" "+b+" and "+c+" is "+result2);
		int result3=Maxnum2(a,b,c,d);
		System.out.println("Maximum number between four numbers"+" from "+a+" "+b+" "+c+" and "+d+" is "+result3);

	}

}
