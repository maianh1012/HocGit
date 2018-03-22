package BasicExercises;

import java.util.Scanner;

public class LietKeSNTNhoHonN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type n > 2:");
		int n = scan.nextInt();
		while(n<=2){
			System.out.println("Type n > 2:");
			n = scan.nextInt();
		}
		System.out.println("The list of prime numbers that less than " + n + ":");
		listPrimeNumbers(n);
	}
// Method: check prime number
	public static boolean isPrime(int x){
		for(int i =2; i<x; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}
	
// Method: list prime numbers that less than n
	public static void listPrimeNumbers(int n){
		for(int i=2; i<n; i++){
			if(isPrime(i)){
				System.out.print(i + "   ");
			}
		}
	}

}
