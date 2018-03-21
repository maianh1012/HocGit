package BasicExercises;

import java.util.Scanner;

public class TongCacChuSo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type from kyboard the value of n: ");
		int n = scan.nextInt();
		System.out.println("Sum of the Digits: " + sumOfDigits(n));
	}
	
	public static int sumOfDigits(int n){
		int sum=0;
		int m=n;
		while(m!=0){
			sum = sum + m%10;
			m=m/10;
		}
		return sum;
	}
}
