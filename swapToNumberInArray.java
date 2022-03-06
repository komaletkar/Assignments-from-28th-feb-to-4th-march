import java.util.Scanner;

public class swapToNumberInArray {
	public static void SwapArray(int a) {
		int A[] = { 10, 20 };
		int temp = A[0];
		A[0] = A[1];
		System.out.print(A[0] + " ");
		A[0] = temp;
		System.out.print(A[0]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		SwapArray(a);
	}
}
