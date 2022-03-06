import java.util.Scanner;

public class calculatorJava {
	public static int sumOfNumbers(int a,int b)
	 {
		 int sum=a+b;
		 return sum;
		 
	 }
	 public static int MulOfNumbers(int a,int b)
	 {
		 int mul=a*b;
		 return mul;
		 
	 }
	 public static int divOfNumbers(int a,int b)
	 {
		 int div=a/b;
		 return div;
		 
	 }
	 public static int modOfNumbers(int a,int b)
	 {
		 int mod=a%b;
		 return mod;
		 
	 }
	 public static int averageOfNumbers(int a,int b)
	 {
		 int avg=(a+b)/2;
		 return avg;
		 
	 }
		 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter numbers : ");
	 	int a=sc.nextInt();
	 	int b=sc.nextInt();
	 	sumOfNumbers(a,b);
	 	MulOfNumbers(a,b);
	 	divOfNumbers(a,b);
	 	averageOfNumbers(a,b);
	 	System.out.println(sumOfNumbers(a,b));
	 	System.out.println(MulOfNumbers(a,b));
	 	System.out.println(divOfNumbers(a,b));
	 	System.out.println(modOfNumbers(a,b));
	 	System.out.println(averageOfNumbers(a,b));
	 	
	 	

		}

	}

