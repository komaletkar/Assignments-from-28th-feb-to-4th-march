import java.util.Scanner;

public class replaceSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		s=s.substring(3, 8);
		System.out.println(s);
		s=s.substring(3);
		System.out.println(s);

	}

}
