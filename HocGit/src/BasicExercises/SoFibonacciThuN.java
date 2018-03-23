package BasicExercises;

import java.util.Scanner;

public class SoFibonacciThuN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type n>=2");
		int n = scan.nextInt();
		while(n<2){
			System.out.println("Type n>=2");
			n = scan.nextInt();
		}
		System.out.print(0);
		fibonacciN(0, 1, n);
		
	}
// find fibonacci number n
	public static void fibonacciN(int n1, int n2, int n){
		System.out.print(", "+ n2);
		if(n==2){
			System.out.println("\n");
			System.out.println("Fibonacci number n: " + n2);
			return;
		}else{
			n--;
			fibonacciN(n2, n1+n2, n);
		}
		
	}

}
