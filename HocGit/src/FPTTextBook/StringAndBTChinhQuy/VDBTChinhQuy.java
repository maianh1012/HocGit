package FPTTextBook.StringAndBTChinhQuy;

import java.util.Scanner;

public class VDBTChinhQuy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email:");
		String email = input.nextLine();
		System.out.println("Enter your mobile number:");
		String mobile = input.nextLine();
		String emailRegrex = "\\w + @\\w+(\\.\\w+){1,2}";
		String mobileRegex  = "043\\d{6}";
		if(!email.matches(emailRegrex)){
			System.out.println("You Entered the unavailable email");
		}
		if(!mobile.matches(mobileRegex)){
			System.out.println("You entered the unavailable mobile number");
		}
	}
}
