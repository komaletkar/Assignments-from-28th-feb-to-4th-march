import java.util.Scanner;

public class removeWordFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		System.out.println("Enter word you want to remove");
		String word = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			s = s.replaceAll(word, "");
		}
		System.out.println(s);
	}

}
