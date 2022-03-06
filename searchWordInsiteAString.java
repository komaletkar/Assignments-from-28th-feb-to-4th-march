import java.util.Scanner;

public class searchWordInsiteAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		System.out.println("enter word you want search");
		String search=sc.next();
	      int index =s.indexOf(search);
			if(index==-1)
			{
				System.out.println("Word not found");
			}
			else
			{
				System.out.println("Word is found");
			}
			
		}

}
