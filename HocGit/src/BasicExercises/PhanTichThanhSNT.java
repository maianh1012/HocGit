package BasicExercises;

import java.util.Scanner;

public class PhanTichThanhSNT {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type n>2");
		int n = scan.nextInt();
		while(n<=2){
			System.out.println("Type n> 2");
			n = scan.nextInt();
		}
		multiplicationOfPrimeFactors(n);
		
	}

// Method: analyze a integer into the multiplication of prime numbers
	public static void multiplicationOfPrimeFactors(int n){
		System.out.print(n + " = ");
		for(int i=2; i<=n; i++){
			while(n%i==0){
				n=n/i;
				if(n==1){
					System.out.print(i);
				}else{
					System.out.print(i + " x ");
				}
			}
			if(n==1) break;
		}
	}
}
