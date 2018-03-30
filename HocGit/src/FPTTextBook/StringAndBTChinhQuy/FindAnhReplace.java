package FPTTextBook.StringAndBTChinhQuy;

import java.util.Scanner;

public class FindAnhReplace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the content:");
		String content = scan.nextLine();
		System.out.println("Type the string you want to find");
		String find = scan.nextLine();
		System.out.println("Type the string you want to replace:");
		String replace = scan.nextLine();
		String result = content.replaceAll(find, replace);
		System.out.println(result);
	}

}
