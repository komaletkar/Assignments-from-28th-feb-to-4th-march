import java.util.Scanner;

public class addTwoNumbers {
	public static int addNumbers(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = addNumbers(a, b);
		System.out.println(res);
	}

}
