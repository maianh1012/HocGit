package BasicExercises;

import java.util.Scanner;

public class LietKeNSNTDauTien {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type n>0:");
		int n = scan.nextInt();
		while(n<=0){
			System.out.println("Type n>0:");
			n = scan.nextInt();
		}
		System.out.println("The list of "+ n + " first prime numbers: ");
		listFirstPrimeNumbers(n);
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
	
// Method: List n first prime numbers
	public static void listFirstPrimeNumbers(int n){
		int count = n;
		int i=1;
		while(count!=0){
			i++;
			if(isPrime(i)){
				System.out.print(i + "   ");
				count--;
			}
		}
	}
}
