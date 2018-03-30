package FPTTextBook.StringAndBTChinhQuy;

import java.util.Scanner;

public class StringToArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer numbers that are separated by \",\" ");
		String str = scan.nextLine();
		scan.close();
		String[] integerNumbers = str.split(",");
		for(String stringNumber : integerNumbers){
			int integerNumber = Integer.parseInt(stringNumber);
			if(integerNumber%2==0){
				System.out.println(integerNumber);
			}
			
		}
	}

}
