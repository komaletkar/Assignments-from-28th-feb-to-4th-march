import java.util.Scanner;

public class diffTwoArrays {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int A[]= {10, 20, 30, 40, 50};
				int B[]= {2, 15, 45, 16 ,32};
				int C[]=new int[A.length];
				for(int j=0;j<A.length;j++) {
				  C[j]= A[j]-B[j];
					System.out.print(C[j]+" ");
					
				}
			
			}
		}


