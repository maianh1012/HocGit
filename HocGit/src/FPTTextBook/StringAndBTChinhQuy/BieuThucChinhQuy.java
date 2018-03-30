package FPTTextBook.StringAndBTChinhQuy;

import java.util.Scanner;

public class BieuThucChinhQuy {
	//regular expression (regex)

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter mobile number:");
		String mobileNumber = scan.nextLine();
		String pattern = "0[0-9]{9,10}";
		if(mobileNumber.matches(pattern)){
			System.out.println("The mobile number is available");
		}else{
			System.out.println("The moblie number is not available");
		}
	}

}
